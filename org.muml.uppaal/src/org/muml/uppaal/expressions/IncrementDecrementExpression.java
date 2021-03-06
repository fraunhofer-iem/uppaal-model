/**
 */
package org.muml.uppaal.expressions;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Increment Decrement Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Abstract base class for expressions describing increment (++) or decrement (--) of an integer-based expression. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.uppaal.expressions.IncrementDecrementExpression#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.muml.uppaal.expressions.IncrementDecrementExpression#getOperator <em>Operator</em>}</li>
 * </ul>
 *
 * @see org.muml.uppaal.expressions.ExpressionsPackage#getIncrementDecrementExpression()
 * @model abstract="true"
 * @generated
 */
public interface IncrementDecrementExpression extends Expression {
	/**
	 * Returns the value of the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The expression to be incremented or decremented.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Expression</em>' containment reference.
	 * @see #setExpression(Expression)
	 * @see org.muml.uppaal.expressions.ExpressionsPackage#getIncrementDecrementExpression_Expression()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getExpression();

	/**
	 * Sets the value of the '{@link org.muml.uppaal.expressions.IncrementDecrementExpression#getExpression <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' containment reference.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(Expression value);

	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link org.muml.uppaal.expressions.IncrementDecrementOperator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies increment or decrement.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see org.muml.uppaal.expressions.IncrementDecrementOperator
	 * @see #setOperator(IncrementDecrementOperator)
	 * @see org.muml.uppaal.expressions.ExpressionsPackage#getIncrementDecrementExpression_Operator()
	 * @model required="true"
	 * @generated
	 */
	IncrementDecrementOperator getOperator();

	/**
	 * Sets the value of the '{@link org.muml.uppaal.expressions.IncrementDecrementExpression#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see org.muml.uppaal.expressions.IncrementDecrementOperator
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(IncrementDecrementOperator value);

} // IncrementDecrementExpression
