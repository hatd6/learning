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
package leetcode.problem.programmingskills;

/**
 *
 * @author Hammer
 */

public class SolutionProgrammingSkills {
    private static IFunction interfaceFunc;

    public static void main(String[] args) {
	IFunction mergeFunc = new MergeStringsAlternately();
	MergeStr mergeStr = new MergeStr(mergeFunc);
    }
}

class MergeStr {
    private IFunction iFunction;

    public MergeStr(IFunction iFunction) {
	this.iFunction = iFunction;
    }

    public String mergeString(String word1, String word2) {
	return this.iFunction.mergeStrAlter(word1, word2);
    }
}
