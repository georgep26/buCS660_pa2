package simpledb;

import java.io.Serializable;

/**
 * IndexPredicate compares a field which has index on it against a given value
 * @see simpledb.IndexDbIterator
 */
public class IndexPredicate implements Serializable {
	
    private static final long serialVersionUID = 1L;
    private Field f;
    private Predicate.Op op;
	
    /**
     * Constructor.
     *
     * @param fvalue The value that the predicate compares against.
     * @param op The operation to apply (as defined in Predicate.Op); either
     *   Predicate.Op.GREATER_THAN, Predicate.Op.LESS_THAN, Predicate.Op.EQUAL,
     *   Predicate.Op.GREATER_THAN_OR_EQ, or Predicate.Op.LESS_THAN_OR_EQ
     * @see Predicate
     */
    public IndexPredicate(Predicate.Op op, Field fvalue) {
        // some code goes here
        this.op = op;
        this.f = fvalue;
    }

    public Field getField() {
        // some code goes here
        return f;
    }

    public Predicate.Op getOp() {
        // some code goes here
        return op;
    }

    /** Return true if the fieldvalue in the supplied predicate
        is satisfied by this predicate's fieldvalue and
        operator.
        @param ipd The field to compare against.
    */
    public boolean equals(IndexPredicate ipd) {
        // I think i need to do a switch like in IntField here? Then you can just use == with any operator passed?
        // trying just == first
        // TODO make sure that this is right later... it is working for scantest right now but might be accident
        return ipd.f == f;
    }

}
