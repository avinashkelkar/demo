/**
 * DeliveryHistoryRepsitory.java
 * 23-Jun-2017
 * <p>
 * Copyright © FirstFuel Software. 2010-2017 All right reserved. The copyright to
 * the computer program(s) herein is the property of FirstFuel Software. The
 * program(s) may be used and/or copied only with the written permission of
 * FirstFuel Software.
 * </p>
 */
package com.monthly;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * <p> DeliveryHistoryRepsitory
 * </p>
 * @version 1.0
 * @author Avinash Kelkar
 * @since 23-Jun-2017
 */
public interface DeliveryHistoryRepsitory
    extends JpaRepository<DeliveryHistory, String> {

    /**
     * <p>
     * 
     * </p>
     */
    List<DeliveryHistory> findByUserId(String userId);

}
