package com.eriol.blog.business.service.impl;

import com.eriol.blog.business.dao.SortsDao;
import com.eriol.blog.business.dto.SortsDto.Option;
import com.eriol.blog.business.model.Sorts;
import com.eriol.blog.business.service.SortsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SortsServiceImpl implements SortsService {

    @Autowired
    private SortsDao sortsDao;

    @Override
    public List<Sorts> selectAll() {
        return sortsDao.selectAll();
    }

    @Override
    public int deleteByPrimaryKey(int key) {
        return sortsDao.deleteByPrimaryKey(key);
    }

    @Override
    public int insert(Sorts entity) {
        return sortsDao.insert(entity);
    }

    @Override
    public int updateByPrimaryKeySelective(Sorts entity) {
        return sortsDao.updateByPrimaryKeySelective(entity);
    }

    @Override
    public Option sortOption() {
        List<Sorts> sortsList = sortsDao.selectAll();
        Option optionRoot = new Option();
        List<Option> optionList1 = new ArrayList<>();

        for (Sorts sort :
                sortsList) {
            if (sort.getParentSortId() == 0) {
                Option temp = new Option();
                temp.setLabel(sort.getSortName());
                temp.setValue(Long.toString(sort.getSortId()));
                optionList1.add(temp);
            }
        }

        for (Sorts sort :
                sortsList) {
            if (sort.getParentSortId() != 0) {
                for (int i = 0; i < optionList1.size(); i++) {
                    if (Long.toString(sort.getParentSortId()).equals(optionList1.get(i).getValue())) {

                        Option temp = new Option();
                        temp.setLabel(sort.getSortName());
                        temp.setValue(Long.toString(sort.getSortId()));

                        optionList1.get(i).getChildren().add(temp);

                        break;
                    }
                }
            }
        }
        optionRoot.setChildren(optionList1);
        return optionRoot;
    }
}
