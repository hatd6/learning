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
package learning.design.partterns.buttons;

/**
 * @author Hammer
 */

public class HtmlButton implements Button {
    @Override
    public void render() {
	System.out.println("<button>Test Button</button>");
	onClick();
    }

    @Override
    public void onClick() {
	System.out.println("Click! Button says - 'Hello World!'");
    }
}
