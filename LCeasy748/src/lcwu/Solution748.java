package lcwu;

import java.util.*;
public class Solution748 {
	public String shortestCompletingWord(String licensePlate, String[] words) {
		licensePlate = licensePlate.toLowerCase();
		char[] lpcarr = licensePlate.toCharArray();
		Map<Character, Integer> lpmap = new HashMap<>();
		List<String> compStrings = new ArrayList<String> ();
		int ind = 0;

		for(int i=0; i<lpcarr.length; i++){

			if(Character.isLetter(lpcarr[i])){ //lpcarr[i] is a letter
				if(!lpmap.containsKey(lpcarr[i])){
					lpmap.put(lpcarr[i],1);
				}
				else{
					int val = lpmap.get(lpcarr[i]);
					val++;
					lpmap.put(lpcarr[i],val);
				}
			} //lpcarr[i] is a letter

			else
				continue;
		}


		//////debug
		System.out.println("Printing lpmap");
		for (Character name: lpmap.keySet()){
			String key = name.toString();
			String value = lpmap.get(name).toString();
			System.out.println(key + " " + value);
		}
		/////debug


		Map<Character, Integer> wmap = new HashMap<>();
		for(int i=0; i<words.length; i++){ //each string
			boolean complete = true;
			char[] wcarr = words[i].toCharArray();
			for(int j=0; j<wcarr.length; j++){ //each char
				if(!wmap.containsKey(wcarr[j])){
					wmap.put(wcarr[j],1);
				}
				else{
					int val = wmap.get(wcarr[j]);
					val++;
					wmap.put(wcarr[j],val);
				}
			} //each char


			//////debug
			System.out.println("Printing wmap for " + words[i]);
			for (Character name: wmap.keySet()){
				String key = name.toString();
				String value = wmap.get(name).toString();
				System.out.println(key + " " + value);
			}
			/////debug


			for(Character wc : wmap.keySet()){
				if(lpmap.containsKey(wc) && lpmap.get(wc) > wmap.get(wc))
					complete = false;
			}

			for(Character lpc : lpmap.keySet()){
				if(!wmap.containsKey(lpc))
					complete = false;
			}


			if(complete){
				compStrings.add(words[i]);
			}
			wmap.clear();
		} //each string

		if(!compStrings.isEmpty()){
			int shortest = compStrings.get(0).length();
			System.out.println(0 + " " + compStrings.get(0));
			for (int i = 1; i < compStrings.size(); i++) {
				System.out.println(i + " " + compStrings.get(i));
				if(shortest > compStrings.get(i).length())
					shortest = compStrings.get(i).length();
			}

			for (int i = 0; i < compStrings.size(); i++) {
				if(compStrings.get(i).length() == shortest){
					System.out.println("toreturn " + compStrings.get(i));
					return compStrings.get(i);
				}
			}
		}

		return "";
	}
}
