/*
 * GUMBOX BLUE CORPORATION.
 * Copyright (c) 2023-present Gumbox Blue, Corporation. All Rights Reserved.
 *
 * This software is the confidential and proprietary information of Gumbox Blue Corporation.
 * ("Confidential Information"). You shall not disclose such Confidential Information and
 * shall use it only in accordance with the terms of the license agreement you entered
 * into with Gumbox Blue Corporation.
 *
 */
package learning.design.partterns;

/**
 * @author Hammer
 */

public class Truck implements Transport {

    public Truck() {
	System.out.println("TruckTruckTruckTruck");
    }

    @Override
    public String deliver() {
	System.out.println("TruckTruckTruckTruckTruck");
	return null;
    }

}
