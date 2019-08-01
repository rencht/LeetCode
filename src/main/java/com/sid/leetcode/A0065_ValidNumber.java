package com.sid.leetcode;

/**
 * 65. Valid Number.
 *
 * <blockquote>
 * Validate if a given string can be interpreted as a decimal number.
 * 
 * <p>Some examples:
 * <blockquote>
 * "0" => true
 * <p>" 0.1 " => true
 * <p>"abc" => false
 * <p>"1 a" => false
 * <p>"2e10" => true
 * <p>" -90e3    " => true
 * <p>" 1e" => false
 * <p>"e3" => false
 * <p>" 6e-1" => true
 * <p>" 99e2.5  " => false
 * <p>"53.5e93" => true
 * <p>" --6 " => false
 * <p>"-+3" => false
 * <p>"95a54e53" => false
 * </blockquote>
 * 
 * <p>
 * <b>Note:</b> It is intended for the problem statement to be ambiguous. You should gather all requirements up front before
 * implementing one. However, here is a list of characters that can be in a valid decimal number:
 * <li>Numbers 0-9</li>
 * <li>Exponent - "e"</li>
 * <li>Positive/negative sign - "+"/"-"</li>
 * <li>Decimal point - "."</li>
 * <p>Of course, the context of these characters also matters in the input. 
 * 
 * </blockquote>
 *
 * @author Sid.Chen
 * @version 1.0, 2019-07-30
 *
 */
public class A0065_ValidNumber {

	public boolean isNumber(final String s) {
		final String target = s.trim();

        boolean pointSeen = false;
        boolean eSeen = false;
        boolean numberSeen = false;
        boolean numberAfterE = true;

        for (int i = 0; i < target.length(); i++) {
            final char c = target.charAt(i);

            if ('0' <= c && c <= '9') {
                numberSeen = true;
                numberAfterE = true;
            }
            else if (c == '.') {
                if (pointSeen || eSeen) return false;	// Two decimal points case is illegal. Decimal point after exponent is illegal.
                pointSeen = true;
            }
            else if (c == 'e') {
                if (eSeen || !numberSeen) return false;	// Two exponents case is illegal. No leading number before exponent is illegal.
                eSeen = true;
                numberAfterE = false;
            }
            else if (c == '-' || c == '+') {
                if (i != 0 && target.charAt(i - 1) != 'e') return false;	// Sign can only place at start position of a number or a exponent.
            }
            else {
                return false;  // Other characters
            }
        }

        return numberSeen && numberAfterE;
    }

}
