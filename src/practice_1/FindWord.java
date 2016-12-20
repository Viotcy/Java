package practice_1;

public class FindWord {

	public static void main(String[] args) {
		String s = "金黃色、淺綠色、藍色、橙色，色色分明";
		int[] index = new int[6];
		int all = s.length();  //all等於原陣列長度

		while (s.indexOf("色") != -1) {
			int i = 0;
			index[i] = s.indexOf("色") + (all - s.length()); //"色的位置"等於目前位置加上減掉的個數
			s = s.substring(s.indexOf("色") + 1);  //去掉已找出來的色
			System.out.println("第" + (i + 1) + "色在字串第" + index[i] + "個");
			i++;
		}

	}

}
