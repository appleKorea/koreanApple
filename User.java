package CardGame.BlackJack;

import CardGame.Card;

import java.util.List;

public class User {
    // 유저가 가지고 잇는 카드들
    private List<Card> cards;

    // 더이상 카드를 받지 않을 경우 true
    private boolean finish;

    // 사용자가 가지고 있는 금액
    private double money;

    public User() {
        cards = new List<>();
		finish = false;
		money = 1000;
		
		/*초기화 부분
        * cards --> 원하는 리스트로
        * finish --> false
        * money --> 기초 시작자금 1000원으로
        * */
    }

    // 카드를 1장 받음 false 리턴
    public void hit() {
		a = this.draw();
		cards.add(a);
		this.finish = false;
	}

    // 더이상 카드를 받지 않음 true 리턴
    public void stand() {
		finish = true;
	}

    // 돈을 배팅 (한 판에 1번 배팅 기본 100원)
    public void bet() {
		money -= 100;
	}

    // 현재 들고있는 총 카드 숫자들의 합
    public void getTotalNum() {
		int total_num = 0;
		for(int i = 0 ; i < this.cards.size() ; i++) {
			total_num += cards.getNum(i);
		}
		System.out.println("total num : " + total_num ) ;		
	}

    @Override
    public String toString() {
		for( int i = 0 ; i<this.cards.size() ; i++)
			System.out.println(+this.getSuit(i)+" "+this.getNum(i));
        // 사용자의 현재 카드정보를 보여줌 --> {(0번카드, 1번카드.... ,i번카드,): 전체 카드숫자의합}
        System.out.println(" : " + this.getTotalNum());
		return super.toString();
    }
}
