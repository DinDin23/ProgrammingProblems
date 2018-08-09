import java.util.*;

public class David {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int numOfFiles = kb.nextInt();
        kb.nextLine();
        ArrayList<String> fileNames = new ArrayList<String>();
        for(int i = 0; i < numOfFiles; i++)
            fileNames.add(kb.nextLine());
        SortStrings comparing = new SortStrings();
        Collections.sort(fileNames, comparing);
        for(String s : fileNames)
        	System.out.println(s);
	}
}
class SortStrings implements Comparator{

	@Override
	public int compare(Object obj1, Object obj2) {
		String firstImage = (String)obj1;
		String secondImage = (String)obj2;
		if(firstImage.substring(0, 3).equalsIgnoreCase("the"))
			firstImage = firstImage.substring(3);
		if(secondImage.substring(0, 3).equalsIgnoreCase("the"))
			secondImage = secondImage.substring(3);
		if(firstImage.substring(firstImage.length() - 3).compareTo(secondImage.substring(secondImage.length() - 3)) > 0)
			return 1;
		else if(firstImage.substring(firstImage.length() - 3).compareTo(secondImage.substring(secondImage.length() - 3)) < 0)
			return -1;
		else {
			if(firstImage.substring(0, firstImage.length() - 3).compareTo(secondImage.substring(0, secondImage.length() - 3)) < 0) 
				return 1;
			if(firstImage.substring(0, firstImage.length() - 3).compareTo(secondImage.substring(0, secondImage.length() - 3)) > 0) 
				return -1;
			else
				return 0;
				
		}
	}
}

