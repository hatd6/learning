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
package ocp;

import java.io.File;

/**
 * @author Hammer
 */
public class App {
    public static void main(String[] args) throws Exception {

    }

    static void replaceNameFile() {
	File dir = new File("C:\\Users\\Hammer\\Downloads");
	File[] directoryListing = dir.listFiles();
	boolean isModify;
	if (directoryListing != null) {
	    for (File child : directoryListing) {
		String str = child.getName().replaceAll("[\\[\\]\\{\\}\\(\\)]", "-");
		isModify = child.renameTo(new File("C:\\Users\\Hammer\\Downloads\\" + str));

		System.out.println("[file]: " + str + (isModify ? " == OK" : " == FAIL"));

	    }

	} else {
	    dir.isDirectory();
	    // Handle the case where dir is not really a directory.
	    // Checking dir.isDirectory() above would not be sufficient
	    // to avoid race conditions with another process that deletes
	    // directories.
	}
    }

}
