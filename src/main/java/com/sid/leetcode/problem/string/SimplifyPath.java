package com.sid.leetcode.problem.string;

/**
 * 71. Simplify Path.
 *
 * <blockquote>
 * Given an <b>absolute path</b> for a file (Unix-style), simplify it. Or in other words, convert it to the <b>canonical path</b>.
 * <p>In a UNIX-style file system, a period . refers to the current directory. Furthermore, a double period .. moves the directory
 * up a level. For more information, see: <a href="https://www.linuxnix.com/abslute-path-vs-relative-path-in-linuxunix/">Absolute path vs relative path in Linux/Unix</a>
 * <p>Note that the returned canonical path must always begin with a slash /, and there must be only a single slash / between directory
 * names. The last directory name (if it exists) must not end with a trailing /. Also, the canonical path must be the shortest string
 * representing the absolute path.
 * 
 * <p>
 * <b>Example 1:</b>
 * <blockquote>
 * <b>Input:</b> "/home/"
 * <p><b>Output:</b> "/home"
 * </blockquote>
 * 
 * <p>
 * <b>Example 2:</b>
 * <blockquote>
 * <b>Input:</b> "/../"
 * <p><b>Output:</b> "/"
 * </blockquote>
 * 
 * <p>
 * <b>Example 3:</b>
 * <blockquote>
 * <b>Input:</b> "/home//foo/"
 * <p><b>Output:</b> "/home/foo"
 * </blockquote>
 * 
 * <p>
 * <b>Example 4:</b>
 * <blockquote>
 * <b>Input:</b> "/a/./b/../../c/"
 * <p><b>Output:</b> "/c"
 * </blockquote>
 * 
 * <p>
 * <b>Example 5:</b>
 * <blockquote>
 * <b>Input:</b> "/a/../../b/../c//.//"
 * <p><b>Output:</b> "/c"
 * </blockquote>
 * 
 * <p>
 * <b>Example 6:</b>
 * <blockquote>
 * <b>Input:</b> "/a//b////c/d//././/.."
 * <p><b>Output:</b> "/a/b/c"
 * </blockquote>
 * 
 * </blockquote>
 *
 * @author Sid.Chen
 * @version 1.0, 2019-07-31
 *
 */
public class SimplifyPath {

	// Stack

	public String simplifyPath(final String path) {
        final String[] paths = path.split("/");

        final String[] dirs = new String[paths.length];
        int length = 0;

        for (final String directory : paths) {
            if ("".equals(directory) || ".".equals(directory)) continue;
            if ("..".equals(directory)) {
                if (length > 0) length--;
                continue;
            }
            dirs[length++] = directory;
        }

        String result = "";
        for (int i = 0; i < length; i++) {
            result = result + "/" + dirs[i];
        }
        return result.isEmpty() ? "/" : result;
    }

}
