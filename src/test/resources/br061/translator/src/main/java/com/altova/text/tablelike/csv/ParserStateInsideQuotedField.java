////////////////////////////////////////////////////////////////////////
//
// ParserStateInsideQuotedField.java
//
// This file was generated by MapForce 2015sp2.
//
// YOU SHOULD NOT MODIFY THIS FILE, BECAUSE IT WILL BE
// OVERWRITTEN WHEN YOU RE-RUN CODE GENERATION.
//
// Refer to the MapForce Documentation for further details.
// http://www.altova.com/mapforce
//
////////////////////////////////////////////////////////////////////////

package com.altova.text.tablelike.csv;

class ParserStateInsideQuotedField extends ParserState {
    public ParserStateInsideQuotedField(Parser owner, ParserStateFactory states) {
        super(owner, states);
    }

    public ParserState process(char current) {
        super.getOwner().appendCharacterToToken(current);
        super.getOwner().moveNext();
        return this;
    }

    public ParserState processFieldDelimiter(char current) {
        super.getOwner().appendCharacterToToken(current);
        super.getOwner().moveNext();
        return this;
    }

    public ParserState processRecordDelimiter(char current) {
        super.getOwner().appendCharacterToToken(current);
        super.getOwner().moveNext();
        return this;
    }

    public ParserState processQuoteCharacter(char current) {
        ParserState result = this;

        super.getOwner().moveNext();
        if (super.getOwner().isEndOfBuffer()) {
            super.getOwner().notifyAboutTokenComplete();
            result = super.getStates().getWaitingForField();
        } else if (super.getOwner().getCurrentCharacter() == current) {
            super.getOwner().appendCharacterToToken(current);
            super.getOwner().moveNext();
        } else {
            result = super.getStates().getInsideField();
        }

        return result;
    }
}