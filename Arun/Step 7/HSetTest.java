import java.util.HashSet;
import java.util.Set;
import java.util.ArrayList;
import java.util.Arrays;

public class HSetTest{

  public static void main(String[] args) {
		
		Set<String> firstSet = new HashSet<String>();
    
		String str1 = "STOREI 1 $T2";
		String str2 = "STOREF 1.5 $T3";
        String codeSeg[] = null;
		firstSet.add("USA");
		firstSet.add("CANADA");
		firstSet.add("U.K.");
		firstSet.add("INDIA");
		
		Set<String> secondSet = new HashSet<String>();
		HashSet<String> hs = new HashSet<String>();
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(12);
		list.add(23);
		list.add(7);
        list.add(56);
        list.add(31);
        list.remove(0);
		secondSet.add("USA");
		secondSet.add("CANADA");
		secondSet.add("Italy");
		secondSet.add("Brazil");
		
		boolean result = firstSet.addAll(secondSet);
		System.out.println("Any element added ? "+result);
		
		System.out.println("Size of First set "+firstSet.size());
		/*for(String country : firstSet) {
			System.out.println("Country "+country);
		}*/

        result = firstSet.remove("USA");
		System.out.println("Any element removed ? "+result);
		
		System.out.println("2) Size of First (2) set "+firstSet.size());
		/*for(String country : firstSet) {
			System.out.println("Country "+country);
		}*/
        
		result = hs.addAll(firstSet);
		System.out.println("Any element removed ? "+result);
        boolean isEqual = hs.equals(firstSet);
        System.out.println("Are two sets equal? "+isEqual);
		hs.add("France");
		System.out.println("2) Size of HS set "+hs.size());
		/*for(String country : hs) {
			System.out.println("Country "+country);
		}*/
        isEqual = hs.equals(firstSet);
        System.out.println("Are two sets equal? "+isEqual);
        codeSeg = str1.split(" ");
        if(str1.startsWith("STORE")) {
            // ($,$), (2, $), ($, a), (a,b) 
            if(HSetTest.isNumeric(codeSeg[1]))
               System.out.println("Does str1 have digits?  " + codeSeg[1] + " kill "+ codeSeg[2]);
        }
        codeSeg = str2.split(" ");
        if(str2.startsWith("STORE")) {
            // ($,$), (2, $), ($, a), (a,b) 
            if(HSetTest.isNumeric(codeSeg[1]))
               System.out.println("Does str2 have digits?  " + codeSeg[1] + " kill "+ codeSeg[2]);
        }
        String lstr = Arrays.toString(list.toArray());
        System.out.println("Arraylist "+lstr);
  }
   public static boolean isNumeric(String inputData) {
  		return inputData.matches("[-+]?\\d+(\\.\\d+)?");
   }
}
