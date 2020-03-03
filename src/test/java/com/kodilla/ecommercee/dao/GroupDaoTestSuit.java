package com.kodilla.ecommercee.dao;

import com.kodilla.ecommercee.domain.Group;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GroupDaoTestSuit {

    @Autowired
    GroupDao groupDao;

    @Test
    public void testGroupDaoSave() {
        Group group = new Group();
                group.setName("group1");
                group.setDescription("description1");
        groupDao.save(group);
        Group group2 = new Group();
                group2.setName("group2");
                group2.setDescription("description2");
        groupDao.save(group2);
        Assert.assertEquals(1, groupDao.findByName("group1").size());
        Assert.assertEquals(2, groupDao.findAll().size());
        groupDao.deleteAll();
    }
}
