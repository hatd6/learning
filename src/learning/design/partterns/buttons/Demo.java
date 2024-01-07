/*
 * GUMBOX BLUE CORPORATION.
 * Copyright (C) 2023-present Gumbox Blue, Corporation. All Rights Reserved.
 *
 * This software is the confidential and proprietary information of Gumbox Blue Corporation.
 * ("Confidential Information"). You shall not disclose such Confidential Information and
 * shall use it only in accordance with the terms of the license agreement you entered
 * into with Gumbox Blue Corporation.
 *
 */
package learning.design.partterns.buttons;

import learning.design.partterns.factory.Dialog;
import learning.design.partterns.factory.HtmlDialog;
import learning.design.partterns.factory.WindowsDialog;

/**
 * @author Hammer
 */

public class Demo {
    private static Dialog dialog;

    public static void main(String[] args) {
	configure();
	runBusinessLogic();
    }

    /**
     * The concrete factory is usually chosen depending on configuration or
     * environment options.
     */
    static void configure() {
	if (System.getProperty("os.name").equals("Windows 10")) {
	    dialog = new WindowsDialog();
	} else {
	    dialog = new HtmlDialog();
	}
    }

    /**
     * All of the client code should work with factories and products through
     * abstract interfaces. This way it does not care which factory it works with
     * and what kind of product it returns.
     */
    static void runBusinessLogic() {
	dialog.renderWindow();
    }
}
