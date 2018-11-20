package CardGame.BlackJack;

import CardGame.Card;
import CardGame.CardDeck;

import java.util.List;

public class Dealer {

    // ������ ������ �ִ� ī��
    private List<Card> cards;

    // ������ ������ �ִ� ī�� �� (����ڿ��� ������ 1�徿 ������)
    private CardDeck cardDecks;

    public Dealer() {
		cards = new List<>();
		this.cardDecks = cardDecks;
		
        /*�ʱ�ȭ�κ�
        * cards --> ���ϴ� ����Ʈ��
        * cardDeck --> ������ CardDeck���� �ʱ�ȭ
        * */

    }

    // �����鿡�� ī�带 ���� �� ������ �Է����� �ް�, ī�嵦���� ī�带 �̾� ī�带 �ǳ���.
    public void handOut() {
		a = this.draw();
		this.cards.add(a);
		
	}

    // ������ ���� ī�� ���� ���� 16 �����̸� ������ 1�� �޾ƿ� false ����
    public void hit() {
			if( this.getTotalNum() <= 16 ) {
			this.stand;
			this.finish = false;
		}
	}

    // ������ ī�� ���� ���� 17 �̻��̸� statnd, true ����
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
        // ������ ���� ī�带 ������ --> 0��? ī��� * ó��(����) 1��° ī��� card�� toString�̿�
        return super.toString();
    }
}
