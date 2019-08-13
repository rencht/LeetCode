package com.sid.leetcode.problem.string;

import java.util.ArrayList;
import java.util.List;

/**
 * 68. Text Justification.
 *
 * <blockquote>
 * Given an array of words and a width maxWidth, format the text such that each line has exactly maxWidth characters
 * and is fully (left and right) justified.
 * <p>You should pack your words in a greedy approach; that is, pack as many words as you can in each line. Pad extra
 * spaces ' ' when necessary so that each line has exactly maxWidth characters.
 * <p>Extra spaces between words should be distributed as evenly as possible. If the number of spaces on a line do not
 * divide evenly between words, the empty slots on the left will be assigned more spaces than the slots on the right.
 * <p>For the last line of text, it should be left justified and no extra space is inserted between words.
 * 
 * <p>
 * <b>Note:</b>
 * <li>A word is defined as a character sequence consisting of non-space characters only.</li>
 * <li>Each word's length is guaranteed to be greater than 0 and not exceed maxWidth.</li>
 * <li>The input array words contains at least one word.</li>
 * 
 * <p>
 * <b>Example 1:</b>
 * <blockquote>
 * <b>Input:</b> words = [ "This", "is", "an", "example", "of", "text", "justification." ], maxWidth = 16
 * <p><b>Output:</b> [ "This    is    an", "example  of text", "justification.  " ]
 * </blockquote>
 * 
 * <p>
 * <b>Example 2:</b>
 * <blockquote>
 * <b>Input:</b> words = [ "What", "must", "be", "acknowledgment", "shall", "be" ], maxWidth = 16
 * <p><b>Output:</b> [ "What   must   be", "acknowledgment  ", "shall be        " ]
 * <p><b>Explanation:</b> Note that the last line is "shall be        " instead of "shall     be", because the last line
 * must be left-justified instead of fully-justified. Note that the second line is also left-justified because it contains
 * only one word.
 * </blockquote>
 * 
 * </blockquote>
 *
 * @author Sid.Chen
 * @version 1.0, 2019-07-31
 *
 */
public class TextJustification {

	public List<String> fullJustify(final String[] words, final int maxWidth) {
        final List<String> result = new ArrayList<String>();

        int start = 0;
        while (start < words.length) {
            start = this.end(words, maxWidth, start, result);
        }

        return result;
    }

    private int end(final String[] words, final int maxWidth, final int start, final List<String> result) {
        int width = 0, end = start;
        // From start index, find current line
        while (width <= maxWidth && end < words.length) {
            width += words[end++].length() + 1;
        }
        end--;
        if (width > maxWidth + 1) end--;

        // Current line width
        width = words[end].length();
        for (int i = start; i < end; i++) {
            words[i] += " ";
            width += words[i].length();
        }

        // If contains only one word or is last line, left-justified
        if (start == end || end == words.length - 1) {
            while (width < maxWidth) {
                words[end] += " ";
                width++;
            }
        }
        else {
        	// Fully-justified
            while (width < maxWidth) {
                for (int i = start; i < end; i++) {
                    if (width < maxWidth) {
                        words[i] += " ";
                        width++;
                    }
                }
            }
        }

        final StringBuilder buffer = new StringBuilder();
        for (int i = start; i <= end; i++) {
            buffer.append(words[i]);
        }
        result.add(buffer.toString());
        return ++end;
    }

}
