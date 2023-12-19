package study;

import java.util.Arrays;
import java.util.Scanner;

public class main_class {

	public static void main(String[] args) {
		String word = "i like banana chacha";

		// 1. ¹®ÀÚ¿­¿¡¼­ Æ¯Á¤ ¹®ÀÚ ÃßÃâ - charAt(
		char ch = word.charAt(2);
		System.out.println(ch);

//		Scanner scan = new Scanner(System.in);
//		ch = scan.next().charAt(0);
//		System.out.println(ch);

		// 2. ¹®ÀÚ¿­ ºñ±³ - equals()
		if (word.equals("i like"))
			System.out.println("°°´Ù");
		else
			System.out.println("°°Áö¾Ê´Ù");

		// 3. ¹®ÀÚ¿­À» byte·Î º¯È¯ getBytes() - ÆÄÀÏ ºÒ·¯¿À±â
		byte[] code = word.getBytes();
		System.out.println(Arrays.toString(code));

		// 4. ¹®ÀÚ¿­¿¡¼­ Æ¯Á¤ ¹®ÀÚ¿­ÀÇ À§Ä¡¸¦ ¸®ÅÏ - indexOf()
		int k = word.indexOf('k');
		System.out.println(k);
		int banana = word.indexOf("banana");
		System.out.println(banana);
		int a5 = word.indexOf('a', 10);
		System.out.println(a5);
		int cha = word.indexOf("ch", 15);
		System.out.println(cha);

		// 5. ¹®ÀÚ¿­ÀÇ ±æÀÌ - length()
		int len = word.length();
		System.out.println("¹®ÀÚ¿­ÀÇ ±æÀÌ : " + len);

		// 6. ¹®ÀÚ¿­ º¯°æ(Ä¡È¯) - replace()
		String temp = word.replace("banana chacha", "rescue tayo");
		System.out.println("¿øº» : " + word);
		System.out.println("º¯°æÈÄ : " + temp);

		// ÀÚ¹Ù½ºÅ©¸³Æ®¿¡¼­ Á¤±ÔÇ¥Çö½ÄÀ» ÀÌ¿ëÇÏ¿© ¹®ÀÚ¿­ º¯°æ
		// ÀÚ¹Ù¿¡¼­µµ Á¤±ÔÇ¥Çö½ÄÀ» »ç¿ëÇÑ´Ù.
		// [^0-9] 
		// Æ¯¼ö¹®ÀÚÁ¦°Å [^¤¡-¤¾¤¿-¤Ó°¡-ÆRa-zA-Z0-9]
		
		temp = word.replaceAll("a", "c");
		System.out.println(temp);
		
		temp = "010-1234-5678";
		temp = temp.replaceAll("[^0-9]", "");
		System.out.println(temp);
		
		// 7. ¹®ÀÚ¿­ ÃßÃâ - substring
		
		temp = word.substring(5);
		System.out.println(temp);
		
		temp = word.substring(7,15);
		System.out.println(temp);
		
		temp =  "skyblue@naver.com";
		// ¾ÆÀÌµğ¿Í Æ÷ÅĞ»çÀÌÆ®ÁÖ¼Ò ¾Ë¾Æ³»±â
		String id = temp.substring(0, temp.indexOf("@"));
		System.out.println("¾ÆÀÌµğ : " + id);
		
		String web = temp.substring(temp.indexOf("@")+1);
		System.out.println(web);
		
		temp = "´ëÀü±¤¿ª½Ã Áß±¸ Áß¾Ó·Î 121¹ø±æ 20";
		// À§ ÁÖ¼Ò¿¡¼­ µµ½Ã¸í°ú µµ·Î¸íÀ» Ãâ·ÂÇÏ¼¼¿ä
		String addr = temp.substring(0, temp.indexOf(" "));
		
		String addrname = temp.substring(temp.indexOf(" ", addr.length()+1 )+1);
		System.out.println(addr + " " + addrname);
		
		// 8.¹®ÀÚ¿­ ºĞ¸® - split(), ÇÏ³ªÀÇ ¹®ÀÚ¿­À» ¹è¿­·Î »ı¼º
		String[] str = word.split(" ");
		System.out.println(Arrays.toString(str));
		temp  = "010-1234-5678";
		String password = temp.split("-")[2];
		
		temp = "12 °¡ 4570";
		String[] car = temp.split(" ");
		if(car[2].equals("4570")) {
			System.out.println("ÁÖÂ÷ºñ Á¤»ê");
		} else if(car[0].equals("12")) {
			System.out.println("ÁÖÂ÷ºñ Á¤»ê");
		}
		
		// 9. ´ë¹®ÀÚ, ¼Ò¹®ÀÚ º¯È¯ - toLoweCase() , toUpperCase()
		temp = word.toUpperCase();
		System.out.println("´ë¹®ÀÚ : " + temp);
		
		temp = temp.toLowerCase();
		System.out.println("¼Ò¹®ÀÚ : " + temp);
		
		// 10. ¹®ÀÚ¿­°ú ¹®ÀÚ¿­À» °áÇÕ - concat()
		
		word = "³»°¡ ÁÁ¾ÆÇÏ´Â ³ë·¡ : ";
		temp = "¹Ù³ª³ª ¾Ë·¯Áö ¿ø¼şÀÌ";
		String song = word.concat(temp);
		System.out.println(song);
		
		// 11. String ÂüÁ¶º¯¼ö°¡ ºó°ªÀÎÁö È®ÀÎ(¹®ÀÚ¿­ÀÌ ÀÖ³Ä ¾ø³Ä) isEmpty() - ¹®ÀÚ¿­ÀÌ ÀÖÀ¸¸é false°ª ¾øÀ¸¸é true°ªÀÌ ³ª¿Â´Ù.;
		System.out.println(word.isEmpty());
		
		// 12. ¹®ÀÚ¿­¿¡ Æ¯Á¤¹®ÀÚ ¶Ç´Â ¹®ÀÚ¿­ Æ÷ÇÔ ¿©ºÎ - contains();
		System.out.println(word.contains("¿ø¼şÀÌ"));
		
		// 13. Æ¯Á¤ ¹®ÀÚ·Î ½ÃÀÛ, ³¡³ª´ÂÁö °Ë»ç - startsWith(), endWith()
		System.out.println(word.startsWith("³Ê"));
		System.out.println(word.startsWith("³»°¡"));
		
		
		
		
		
		
	}

}
