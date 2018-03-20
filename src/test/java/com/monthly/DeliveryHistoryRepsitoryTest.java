/**
 * DeliveryHistoryRepsitoryTest.java
 * 23-Jun-2017
 * <p>
 * Copyright © FirstFuel Software. 2010-2017 All right reserved. The copyright to
 * the computer program(s) herein is the property of FirstFuel Software. The
 * program(s) may be used and/or copied only with the written permission of
 * FirstFuel Software.
 * </p>
 */
package com.monthly;

import static org.assertj.core.api.Assertions.assertThat;

import java.time.LocalDate;
import java.util.Collections;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * <p> DeliveryHistoryRepsitoryTest
 * </p>
 * @version 1.0
 * @author Avinash Kelkar
 * @since 23-Jun-2017
 */
@RunWith(SpringRunner.class)
@DataJpaTest
public class DeliveryHistoryRepsitoryTest {
    
    @Autowired
    private TestEntityManager entityManager;
    
    @Autowired
    private DeliveryHistoryRepsitory deliveryHistoryRepsitory;
    
    @Test
    public void testAddDeliveryHistory() {
        DeliveryHistory deliveryHistory = new DeliveryHistory();
        String itemId = "i1";
        deliveryHistory.setId( "dh1" );
        deliveryHistory.setItemId( itemId );
        String userId = "u1";
        deliveryHistory.setUserId( userId  );
        deliveryHistory.setQuantity( 2.0 );
        deliveryHistory.setDeliveryDate( LocalDate.now() );
        
        entityManager.persist( deliveryHistory );
        
        List<DeliveryHistory> findByUserId = deliveryHistoryRepsitory.findByUserId(userId);
        assertThat(findByUserId).extracting(DeliveryHistory::getUserId).containsOnly(userId);
    }

}
