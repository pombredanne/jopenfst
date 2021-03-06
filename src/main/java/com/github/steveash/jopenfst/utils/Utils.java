/*
 * Copyright 2014 Steve Ash
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.github.steveash.jopenfst.utils;

import java.util.HashMap;

/**
 * Several genearl use utility functions needed by the fst framework
 *
 *
 * @author John Salatas <jsalatas@users.sourceforge.net>
 */
@Deprecated // using guava for string splitting; using the symbol -> index maps in the Fst to do O(1) lookups instead of O(n) lookups
public class Utils {

//  /**
//   * Splits a string into an ArrayList of Strings based on a text delimiter
//   *
//   * @param input the string to split
//   * @param delim the text delimiter
//   * @return the splitted ArrayList
//   */
//  public static ArrayList<String> split_string(String input, String delim) {
//    ArrayList<String> res = new ArrayList<>(input.length());
//
//    int start = 0;
//    int len = 0;
//    int pos = 0;
//
//    while (start < input.length()) {
//      if (delim.isEmpty()) {
//        len = 1;
//      } else {
//        pos = input.indexOf(delim, start);
//        if (pos != -1) {
//          len = pos - start;
//        } else {
//          len = input.length();
//        }
//      }
//      res.add(input.substring(start, len));
//      if (delim.isEmpty()) {
//        start = start + len;
//      } else {
//        start = start + len + delim.length();
//      }
//    }
//
//    return res;
//  }

//  /**
//   * Searches an ArrayList of Strings starting from a specific position for a pattern
//   *
//   * @param src     the input ArrayList of Strings
//   * @param pattern the pattern to search for
//   * @param start   the starting position
//   * @return the index of the first occurrence or -1 if no matches found
//   */
//  public static int search(ArrayList<String> src, ArrayList<String> pattern,
//                           int start) {
//    int index = -1;
//    int pos = -1;
//    int startpos = 0;
//    if (start > src.size() - pattern.size()) {
//      return -1;
//    }
//
//    do {
//      pos = src
//          .subList(startpos + start, src.size() - pattern.size() + 1)
//          .indexOf(pattern.get(0));
//      if (pos == -1) {
//        return pos;
//      }
//
//      boolean flag = true;
//      for (int i = 1; i < pattern.size(); i++) {
//        if (!src.get(startpos + start + pos + i).equals(pattern.get(i))) {
//          index = -1;
//          flag = false;
//          break;
//        }
//      }
//
//      if (flag) {
//        index = startpos + pos;
//        break;
//      } else {
//        startpos += pos + 1;
//      }
//    } while (startpos + start < src.size());
//
//    return index;
//  }
//
//  /**
//   * Rounds a float number to the specified number of decimal digits
//   *
//   * @param value  the float numbe to round
//   * @param digits the number of digits
//   * @return the rounded number
//   */
//  public static float round(float value, int digits) {
//    if (Float.isInfinite(value) || Float.isNaN(value)) {
//      return value;
//    }
//    return (float) (Math.round(value * Math.pow(10, digits)) / Math.pow(10,
//                                                                        digits));
//  }
//
//  /**
//   * Get the position (index) of a particular string in a Strings array.
//   *
//   * The search is case insensitive.
//   *
//   * @param strings the Strings array
//   * @param string  the string to search
//   * @return the index of the first occurrence or -1 if no matches found
//   */
//  public static int getIndex(String[] strings, String string) {
//    for (int i = 0; i < strings.length; i++) {
//      if (string.toLowerCase().equals(strings[i].toLowerCase())) {
//        return i;
//      }
//    }
//    return -1;
//  }

  /**
   * Convert a HashMap<String, Integer> to Strings array
   *
   * @param syms the input HashMap
   * @return the Strings array
   */
  public static String[] toStringArray(HashMap<String, Integer> syms) {
    String[] res = new String[syms.size()];
    for (String sym : syms.keySet()) {
      res[syms.get(sym)] = sym;
    }
    return res;
  }
}
