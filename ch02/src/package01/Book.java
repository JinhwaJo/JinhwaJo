package package01;

import java.util.regex.Pattern;

// ¼³°èµµ(Å¬·¡½º)
public class Book {	// Ã¥
	// : µ¥ÀÌÅÍÀÇ ¹«°á¼º(½Å·Úµµ¸¦ ³ôÀÌ±â À§ÇØ)À» À§ÇØ Á¤º¸Àº´Ğ, Ä¸½¶È­¸¦ ÇÑ´Ù.
	// ¼Ó¼º(ÇÊµå : ¸â¹ö º¯¼ö)
	/* ÇÊµå ¾È¿¡ private : µ¥ÀÌÅÍÀÇ ¹«°á¼º(½Å·Úµµ¸¦ ³ôÀÌ±â À§ÇØ)
	 * 				  : Á¤º¸ Àº´Ğ(Information Hiding)
	 * private ÀÌ ºÙÀº ¸â¹ö´Â ¿ÜºÎ(Å¬·¡½º)¿¡¼­ ÀÚ½ÅÀÇ ÇÊµå¸¦
	 * Á÷Á¢ Á¢±ÙÇÒ ¼ö ¾ø´Ù.	 */
	private String name;	// ÀÌ¸§
	private String author;	// ÀúÀÚ
	private double rate;	// Æò±Õ
	private int rank;		// ¼øÀ§
	private static String p;	// ÆĞÅÏ(¸ğµç °´Ã¼°¡ °øÀ¯ÇÏ´Â ÇÊµå)
	/* ¸Ş¼Òµåº°·Î patternÀ» »ı¼ºÇÏ¸é ¼º´ÉÀúÇÏÀÇ ¿øÀÎÀÌ µÈ´Ù.
	 * ´ë½Å, ÇÊµå¿¡ Çü¼ºÇÏ¿© °øÀ¯½ÃÅ°¸é, ¼º´ÉÀúÇÏ¸¦ ¹æÁöÇÒ ¼ö ÀÖ´Ù.
	 * staticÀÌ ºÙÀ¸¸é "°øÀ¯"ÀÇ ÀÇ¹ÌÀÌ´Ù.*/
	
	// ÇàÀ§(¸Ş¼Òµå : ¸â¹ö ÇÔ¼ö)
	/* ÇÊµå¿Í ¸Ş¼Òµå¸¦ Å¬·¡½º ¾È¿¡ ³ÖÀº »óÅÂ¸¦ Ä¸½¶È­(Encapsulation)
	 * ¶ó°í ¸»ÇÑ´Ù.
	 */
	public void setRank(int r) {
		if(r < 0) {
			System.out.println("¼øÀ§°¡ Àß¸øµÇ¾ú½À´Ï´Ù.");
			return;
		}
		rank = r;
		/* »ç¿ëÀÚ°¡ ¿ÜºÎ¿¡¼­ ÀÔ·ÂÇÑ µ¥ÀÌÅÍ´Â r¿¡ ÀúÀåµÇ°í rank´Â ³» ÇÊµåÀÌ¹Ç·Î,
		 * µÎ °¡Áö°¡ ±¸ºĞµÇ¾î µ¥ÀÌÅÍÀÇ ¹«°á¼ºÀ» À¯ÁöÇÑ´Ù. */
	}

	public void setName(String nm) {
		/* ^´Â ¹®ÀÚ¿­ÀÇ ½ÃÀÛÀ» ÀÇ¹Ì, a-z(¼Ò¹®ÀÚ¸¸), A-Z(´ë¹®ÀÚ¸¸) Çã¿ë,
		 * *´Â ¾ÕÆĞÅÏÀ» ¿©·¯°³ ÀÔ·Â °¡´ÉÇÔÀ» ÀÇ¹Ì(¾øÀ¸¸é ÇÏ³ª¸¸ ¾µ ¼ö ÀÖÀ½),
		 * $´Â ¹®ÀÚ¿­ÀÇ ³¡  */
		p = "^[a-zA-Z\\s]*$";
		// ¿µ¹®ÀÚ°¡ ¾Æ´Ï¸é if¹® ½ÇÇà
		if(!Pattern.matches(p,nm)) {	// PatternÀ» ¿ÀÅä¸¶ÀÌÂ¡ ÇØÁà¾ß ÇÔ.
			System.out.println("Ã¥ ÀÌ¸§ÀÌ Àß¸øµÇ¾ú½À´Ï´Ù.");
			return;
		}
		name = nm;
		
	}
	/* Alt + s - generate getters and setters ÅÇ¿¡¼­ 
	 * ¿øÇÏ´Â °Í¸¸ ¼±ÅÃÇÏ¿© ÇÔ¼ö »ı¼º°¡´É */
	public void setAuthor(String author) {
		// ÁöÀºÀÌ(ÀúÀÚ) ´Â ÇÑ±Û(°ø¹éx)¸¸ ÀúÀå °¡´É
		p = "^[°¡-ÆR]*$";
		if(!Pattern.matches(p, author)) {
			System.out.println("ÀúÀÚ Çü½ÄÀÌ Àß¸øµÇ¾ú½À´Ï´Ù.");
			return;
		}
		this.author = author;	// this¸¦ ºÙ¿©¼­ ÇÊµå¿Í ¸Å°³º¯¼ö¸¦ ±¸ºĞ
	}

	public void setRate(double rate) {
		// 1.0 ~ 5.0±îÁö¸¸ ÀúÀå °¡´É
		if(!(rate >= 1.0 && rate <= 5.0)) {
			System.out.println("ÆòÁ¡À» Àß¸ø ÀÔ·ÂÇÏ¿´½À´Ï´Ù.");
			return;
		}
		this.rate = rate;
	}


}
