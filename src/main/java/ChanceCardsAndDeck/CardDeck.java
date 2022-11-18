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

      public void cards (CardDeck card){
     /* type 1 - free property
        type 2 - move to
        type 3 - transaction
       */
        card.getCard(0).setType(2);// move to Start
        card.getCard(0).setMoveTo(0);
        card.getCard(0).setDescription("");

        card.getCard(1).setType(1); // free orange space
        // card.getCard(1).setMoveTo();

        card.getCard(2).setType(3); // pay 2$
        card.getCard(2).setTransaction(-2);
        card.getCard(2).setDescription("");

        card.getCard(3).setType(1); // free light blue space
        //  card.getCard(3).setMoveTo();

        card.getCard(4).setType(2); // move to beach
        card.getCard(4).setMoveTo(23);
        card.getCard(4).setDescription("");

        card.getCard(5).setType(1); // free red space
          //  card.getCard(5).setMoveTo();

        card.getCard(7).setType(3); // you get 2$
        card.getCard(7).setTransaction(2);
        card.getCard(2).setDescription("");
    }

    public void getRandomCard(){

    }

    @Override
    public String toString() {
        String string= "";
        for (int i=0; i<card.length; i++){
            string=string+card[i].toString()+"\n";
        }
        return "Chance cards" + string;
    }
}
