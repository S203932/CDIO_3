package ChanceCardsAndDeck;

public class ChanceCards {
    private int type;
    private String description;
    private int moveTo;
    private int moveUpTo;
    private int transaction;

    public ChanceCards(){
        initilalizeType();
        initilalizeDescription();
        initilalizeMoveTo();
        initilalizeMoveUpTo();
        initilalizeTransaction();
    }

    public void initilalizeType(){
        this.type = -1;
    }

    public void initilalizeDescription(){
        this.description = "An empty description";
    }

    public void initilalizeMoveTo(){
        this.moveTo = -1;
    }

    public void initilalizeMoveUpTo(){
        this.moveUpTo = -1;
    }

    public void initilalizeTransaction(){
        this.transaction = 0;
    }

    public void setType(int type){
        this.type = type;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public void setMoveTo(int moveTo){
        this.moveTo = moveTo;
    }

    public void setMoveUpTo(int moveUpTo){
        this.moveUpTo = moveUpTo;
    }

    public void setTransaction(int transaction){
        this.transaction = transaction;
    }

    public int getType(){
        return this.type;
    }

    public String getDescription(){
        return this.description;
    }

    public int getMoveTo(){
        return this.moveTo;
    }

    public int getMoveUpTo(){
        return this.moveUpTo;
    }

    public int getTransaction(){
        return this.transaction;
    }

    public String toString(){
        return "This card has the following type: "+this.type+"\nThe following description: "+this.description+
                "\nThe following MoveTo: "+this.moveTo+"\nThe following MoveUpTo: "+this.moveUpTo+"\n And the " +
                "the following transaction: "+this.transaction;
    }




}
