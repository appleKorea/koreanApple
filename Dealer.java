package CardGame.BlackJack;

import CardGame.Card;
import CardGame.CardDeck;

import java.util.List;

public class Dealer {

    // 딜러가 가지고 있는 카드
    private List<Card> cards;

    // 딜러가 가지고 있는 카드 덱 (사용자에게 덱에서 1장씩 나눠줌)
    private CardDeck cardDecks;

    public Dealer() {
		cards = new List<>();
		this.cardDecks = cardDecks;
		
        /*초기화부분
        * cards --> 원하는 리스트로
        * cardDeck --> 구현한 CardDeck으로 초기화
        * */

    }

    // 유저들에게 카드를 나눠 줌 유저를 입력으로 받고, 카드덱에서 카드를 뽑아 카드를 건네줌.
    public void handOut() {
		a = this.draw();
		this.cards.add(a);
		
	}

    // 딜러의 현재 카드 수의 합이 16 이하이면 무조권 1장 받아옴 false 리턴
    public void hit() {
			if( this.getTotalNum() <= 16 ) {
			this.stand;
			this.finish = false;
		}
	}

    // 딜러의 카드 수의 합이 17 이상이면 statnd, true 리턴
    public void stand() {
		if( this.getTotalNum() >= 17 ) {
			this.stand;
			this.finish = true;
		}
	}

    @Override
    public String toString() {
		System.out.println(" * ,");
		for( int i = 1 ; i<this.cards.size() ; i++)
			System.out.println(+this.getSuit(i)+" "+this.getNum(i));
        System.out.println(" : " + this.getTotalNum());
        // 딜러의 현재 카드를 보여줌 --> 0번? 카드는 * 처리(숨김) 1번째 카드는 card의 toString이용
        return super.toString();
    }
}
