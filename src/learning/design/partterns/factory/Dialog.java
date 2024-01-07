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
package learning.design.partterns.factory;

import learning.design.partterns.buttons.Button;

/**
 * @author Hammer
 */

public abstract class Dialog {
    public void renderWindow() {
	// ... other code ...

	Button okButton = createButton();
	okButton.render();
    }

    /**
     * Subclasses will override this method in order to create specific button
     * objects.
     */
    public abstract Button createButton();
}
