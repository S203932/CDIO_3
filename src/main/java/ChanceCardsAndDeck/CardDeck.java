package ChanceCardsAndDeck;

import java.util.Arrays;

public class CardDeck {
    private ChanceCards[] card;

    public CardDeck() {
        initilalizeCard();
    }

    public void initilalizeCard(){
        this.card=new ChanceCards[20];
    }

    public void setCard(ChanceCards[] card) {
        this.card = card;
    }

    public ChanceCards getCard(int index) {
        return card[index];
    }

    @Override
    public String toString() {
        String string= "";
        for (int i=0; i<card.length; i++){
            string=string+card[i].toString()+"\n";
        }
        return "Chence cards" + string;
    }
}
