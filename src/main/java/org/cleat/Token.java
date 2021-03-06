package org.cleat;

/**
 * Tokenizer for Lisp
 * 
 * 
 */
public class Token
{
    public int type;
    public String text;
    
    public Token(int type, String text)
    {
      this.type = type;
      this.text = text;
    }
    
    public String toString() 
    {
        String tname = LispLexer.tokenNames[type];
        return "<'" + text + "'," + tname +">";
    }
}
