/* Generated By:JJTree: Do not edit this line. ASTBNFParenthesized.java Version 4.1 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY= */
package org.javacc.jjtree;

public class ASTBNFParenthesized extends JJTreeNode{
  public ASTBNFParenthesized(int id) {
    super(id);
  }

  public ASTBNFParenthesized(JJTreeParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(JJTreeParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=b521f25c8b43b0cffba82239b2932eb1 (do not edit this line) */