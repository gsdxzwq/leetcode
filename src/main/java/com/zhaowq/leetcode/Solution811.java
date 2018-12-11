package com.zhaowq.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Subdomain Visit Count
 * <p>
 * A website domain like "discuss.leetcode.com" consists of various subdomains.
 * At the top level, we have "com", at the next level, we have "leetcode.com", and at the lowest level, "discuss.leetcode.com".
 * When we visit a domain like "discuss.leetcode.com", we will also visit the parent domains "leetcode.com" and "com" implicitly.
 * <p>
 * Now, call a "count-paired domain" to be a count (representing the number of visits this domain received), followed by a space, followed by the address.
 * An example of a count-paired domain might be "9001 discuss.leetcode.com".
 * <p>
 * We are given a list cpdomains of count-paired domains.
 * We would like a list of count-paired domains, (in the same format as the input, and in any order), that explicitly counts the number of visits to each subdomain.
 * <p>
 * Example 1:
 * Input:
 * ["9001 discuss.leetcode.com"]
 * Output:
 * ["9001 discuss.leetcode.com", "9001 leetcode.com", "9001 com"]
 * Explanation:
 * We only have one website domain: "discuss.leetcode.com". As discussed above, the subdomain "leetcode.com" and "com" will also be visited. So they will all be visited 9001 times.
 * <p>
 * Example 2:
 * Input:
 * ["900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org"]
 * Output:
 * ["901 mail.com","50 yahoo.com","900 google.mail.com","5 wiki.org","5 org","1 intel.mail.com","951 com"]
 * Explanation:
 * We will visit "google.mail.com" 900 times, "yahoo.com" 50 times, "intel.mail.com" once and "wiki.org" 5 times.
 * For the subdomains, we will visit "mail.com" 900 + 1 = 901 times, "com" 900 + 50 + 1 = 951 times, and "org" 5 times.
 *
 * @author zhaowq
 * @date 2018/12/4
 */
public class Solution811 {
    public static List<String> subdomainVisits(String[] cpdomains) {
        List<String> result = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        for (String cpdomain : cpdomains) {
            String[] arrays = cpdomain.split(" ");
            int count = Integer.parseInt(arrays[0]);
            String domain = arrays[1];
            String[] subDomains = domain.split("\\.");
            for (int i = 0; i < subDomains.length; i++) {
                StringBuilder sb = new StringBuilder();
                for (int j = i; j < subDomains.length - 1; j++) {
                    sb.append(subDomains[j]).append(".");
                }
                sb.append(subDomains[subDomains.length - 1]);
                String key = sb.toString();
                if (map.containsKey(key)) {
                    map.put(key, count + map.get(key));
                } else {
                    map.put(key, count);
                }
            }
        }
        for (String key : map.keySet()) {
            result.add(map.get(key) + " " + key);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(subdomainVisits2(new String[]{"9001 discuss.leetcode.com"}));
    }

    /**
     * 官方Solution，写的比我优雅一点
     */
    public static List<String> subdomainVisits2(String[] cpdomains) {
        Map<String, Integer> counts = new HashMap<>();
        for (String domain : cpdomains) {
            String[] cpinfo = domain.split("\\s+");
            String[] frags = cpinfo[1].split("\\.");
            int count = Integer.valueOf(cpinfo[0]);
            String cur = "";
            for (int i = frags.length - 1; i >= 0; --i) {
                cur = frags[i] + (i < frags.length - 1 ? "." : "") + cur;
                counts.put(cur, counts.getOrDefault(cur, 0) + count);
            }
        }

        List<String> ans = new ArrayList<>();
        for (String dom : counts.keySet()) {
            ans.add("" + counts.get(dom) + " " + dom);
        }
        return ans;
    }
}
