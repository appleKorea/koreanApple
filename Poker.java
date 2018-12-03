import CardGame.Card;
import CardGame.CardDeck;

import java.util.ArrayList;
import java.util.List;

public class Poker {

    private List<Card> cards;
    private CardDeck cardDecks;
	
	public static final int RSF == 13;
	public static final int BSF == 12;
	public static final int STF == 11;
	public static final int FOC == 10;
	public static final int FLH == 9;
	public static final int FLS == 8;
	public static final int MOT == 7;
	public static final int BST == 6;
	public static final int STR == 5;
	public static final int TRF == 4;
	public static final int TWF == 3;
	public static final int ONE == 2;
	public static final int TOP == 1;
	

	public int pair;
	public int flush;
	public int straight;
	
    public Poker(){
        cards = new ArrayList<>();
        cardDecks = new CardDeck();
        cardDecks.shuffle();
		
        for (int i = 0; i < 5; i++){
            cards.add(cardDecks.draw());
        }
    }

	//Card를 숫자 크기순으로 나열하는 메소드
	public void arrangeCards () {
		int temp;
		String temps = "";
		
		for(int i = 0; i < 4; i++) {
			for(int j = i; j < 4; j++) {
				if(cards.get(i).getNum() > cards.get.(j+1).getNum()) {
					temp = cards.get(i).getNum();
					cards.set(i).setNum() = cards.get.(j+1).getNum();
					cards.set(j+1).setNum() = temp;

					temps = cards.get(i).getSuit();
					cards.set(i).setSuit() = cards.get.(j+1).getSuit();
					cards.set(j+1).setSuit() = temp;
				}
			} 
		}
	}
	
	//나의 패는?
	public int checkCards () {
		int MyDeck;
		this.pair = 0;
		this.flush = 0;
		
		this.cards.arrangeCards();
		
		for(int i = 0; i < 6; i++) {
			for(int j = i; j < 6; j++) {
				if(cards.get(i).getNum() == cards.get.(j+1).getNum())
					pair++;
			}
		}
		
		if(cards.get(0).getSuit() == cards.get(1).getSuit() &&
			cards.get(1).getSuit() == cards.get(2).getSuit() &&
			cards.get(2).getSuit() == cards.get(3).getSuit() &&
			cards.get(3).getSuit() == cards.get(4).getSuit() )
			flush++;
			
		if(cards.get(0).getNum()+1 == cards.get(1).getSNum() &&
			cards.get(1).getNum()+1 == cards.get(2).getNum() &&
			cards.get(2).getNum()+1 == cards.get(3).getNum() &&
			cards.get(3).getNum()+1 == cards.get(4).getNum() )
			straight++;
		
		if(cards.get(0).getNum()==1 && cards.get(1).getNum()==10 && cards.get(2).getNum()==11 && cards.get(3).getNum()==12 && cards.get(4).getNum()==13 &&
		cards.get(0).getSuit()=="S" && flush==1) //로얄 스트레이트 플러쉬
		{
			MyDeck = 13;
		}
		else if(cards.get(0).getNum()==1 && cards.get(1).getNum()==2 && cards.get(2).getNum()==3 && cards.get(3).getNum()==4 && cards.get(4).getNum()==5 &&
		cards.get(0).getSuit()=="S" && flush==1) // 백스트레이트 플러쉬
		{	
			MyDeck = 12;
		}
		else if(flush==1 && straight==1) //스트레이트 플러쉬 
		{
			MyDeck = 11;
		}
		else if(pair == 5) //포카드
		{
			MyDeck = 10;
		}
		else if(pair == 4) //풀하우스
		{
			MyDeck = 9;
		}
		else if(flush == 1) //플러쉬
		{
			MyDeck = 8;
		}
		else if(cards.get(0_getNum()==10 && straight == 1) //마운틴
		{
			MyDeck = 7;
		}
		else if(cards.get(0_getNum()==1 && straight == 1) //벡스트레이트
		{
			MyDeck = 6;
		}
		else if(straight == 1) //스트레이트
		{
			MyDeck = 5;
		}
		else if(pair == 3) //트리플
		{
			MyDeck = 4;
		}
		else if(pair == 2) //투 페어
		{
			MyDeck = 3;
		}
		else if(pair == 1) //원 페어
		{
			MyDeck = 2;
		}
		else // 탑
		{
			MyDeck = 1;
		}
		
		return MyDeck;
	}
	
	
    public String toString(){
        String s = "";

        for (Card c : cards) {
            s += c.toString();
            s.replace("11","J");
            s.replace("12", "Q");
            s.replace("13","K");

        }

        return "{" + s + "}";

    }

    public void cardsinfo(){

    }



}