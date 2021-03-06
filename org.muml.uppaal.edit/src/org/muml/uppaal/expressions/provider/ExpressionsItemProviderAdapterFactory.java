/**
 */
package org.muml.uppaal.expressions.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.muml.uppaal.expressions.util.ExpressionsAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ExpressionsItemProviderAdapterFactory extends ExpressionsAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionsItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.muml.uppaal.expressions.NegationExpression} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NegationExpressionItemProvider negationExpressionItemProvider;

	/**
	 * This creates an adapter for a {@link org.muml.uppaal.expressions.NegationExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNegationExpressionAdapter() {
		if (negationExpressionItemProvider == null) {
			negationExpressionItemProvider = new NegationExpressionItemProvider(this);
		}

		return negationExpressionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.muml.uppaal.expressions.PlusExpression} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlusExpressionItemProvider plusExpressionItemProvider;

	/**
	 * This creates an adapter for a {@link org.muml.uppaal.expressions.PlusExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPlusExpressionAdapter() {
		if (plusExpressionItemProvider == null) {
			plusExpressionItemProvider = new PlusExpressionItemProvider(this);
		}

		return plusExpressionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.muml.uppaal.expressions.MinusExpression} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MinusExpressionItemProvider minusExpressionItemProvider;

	/**
	 * This creates an adapter for a {@link org.muml.uppaal.expressions.MinusExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMinusExpressionAdapter() {
		if (minusExpressionItemProvider == null) {
			minusExpressionItemProvider = new MinusExpressionItemProvider(this);
		}

		return minusExpressionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.muml.uppaal.expressions.AssignmentExpression} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssignmentExpressionItemProvider assignmentExpressionItemProvider;

	/**
	 * This creates an adapter for a {@link org.muml.uppaal.expressions.AssignmentExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAssignmentExpressionAdapter() {
		if (assignmentExpressionItemProvider == null) {
			assignmentExpressionItemProvider = new AssignmentExpressionItemProvider(this);
		}

		return assignmentExpressionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.muml.uppaal.expressions.IdentifierExpression} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IdentifierExpressionItemProvider identifierExpressionItemProvider;

	/**
	 * This creates an adapter for a {@link org.muml.uppaal.expressions.IdentifierExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createIdentifierExpressionAdapter() {
		if (identifierExpressionItemProvider == null) {
			identifierExpressionItemProvider = new IdentifierExpressionItemProvider(this);
		}

		return identifierExpressionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.muml.uppaal.expressions.LiteralExpression} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LiteralExpressionItemProvider literalExpressionItemProvider;

	/**
	 * This creates an adapter for a {@link org.muml.uppaal.expressions.LiteralExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLiteralExpressionAdapter() {
		if (literalExpressionItemProvider == null) {
			literalExpressionItemProvider = new LiteralExpressionItemProvider(this);
		}

		return literalExpressionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.muml.uppaal.expressions.ArithmeticExpression} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArithmeticExpressionItemProvider arithmeticExpressionItemProvider;

	/**
	 * This creates an adapter for a {@link org.muml.uppaal.expressions.ArithmeticExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createArithmeticExpressionAdapter() {
		if (arithmeticExpressionItemProvider == null) {
			arithmeticExpressionItemProvider = new ArithmeticExpressionItemProvider(this);
		}

		return arithmeticExpressionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.muml.uppaal.expressions.LogicalExpression} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LogicalExpressionItemProvider logicalExpressionItemProvider;

	/**
	 * This creates an adapter for a {@link org.muml.uppaal.expressions.LogicalExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLogicalExpressionAdapter() {
		if (logicalExpressionItemProvider == null) {
			logicalExpressionItemProvider = new LogicalExpressionItemProvider(this);
		}

		return logicalExpressionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.muml.uppaal.expressions.FunctionCallExpression} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionCallExpressionItemProvider functionCallExpressionItemProvider;

	/**
	 * This creates an adapter for a {@link org.muml.uppaal.expressions.FunctionCallExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFunctionCallExpressionAdapter() {
		if (functionCallExpressionItemProvider == null) {
			functionCallExpressionItemProvider = new FunctionCallExpressionItemProvider(this);
		}

		return functionCallExpressionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.muml.uppaal.expressions.CompareExpression} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompareExpressionItemProvider compareExpressionItemProvider;

	/**
	 * This creates an adapter for a {@link org.muml.uppaal.expressions.CompareExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCompareExpressionAdapter() {
		if (compareExpressionItemProvider == null) {
			compareExpressionItemProvider = new CompareExpressionItemProvider(this);
		}

		return compareExpressionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.muml.uppaal.expressions.ConditionExpression} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConditionExpressionItemProvider conditionExpressionItemProvider;

	/**
	 * This creates an adapter for a {@link org.muml.uppaal.expressions.ConditionExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createConditionExpressionAdapter() {
		if (conditionExpressionItemProvider == null) {
			conditionExpressionItemProvider = new ConditionExpressionItemProvider(this);
		}

		return conditionExpressionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.muml.uppaal.expressions.ScopedIdentifierExpression} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScopedIdentifierExpressionItemProvider scopedIdentifierExpressionItemProvider;

	/**
	 * This creates an adapter for a {@link org.muml.uppaal.expressions.ScopedIdentifierExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createScopedIdentifierExpressionAdapter() {
		if (scopedIdentifierExpressionItemProvider == null) {
			scopedIdentifierExpressionItemProvider = new ScopedIdentifierExpressionItemProvider(this);
		}

		return scopedIdentifierExpressionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.muml.uppaal.expressions.QuantificationExpression} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QuantificationExpressionItemProvider quantificationExpressionItemProvider;

	/**
	 * This creates an adapter for a {@link org.muml.uppaal.expressions.QuantificationExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createQuantificationExpressionAdapter() {
		if (quantificationExpressionItemProvider == null) {
			quantificationExpressionItemProvider = new QuantificationExpressionItemProvider(this);
		}

		return quantificationExpressionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.muml.uppaal.expressions.PreIncrementDecrementExpression} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PreIncrementDecrementExpressionItemProvider preIncrementDecrementExpressionItemProvider;

	/**
	 * This creates an adapter for a {@link org.muml.uppaal.expressions.PreIncrementDecrementExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPreIncrementDecrementExpressionAdapter() {
		if (preIncrementDecrementExpressionItemProvider == null) {
			preIncrementDecrementExpressionItemProvider = new PreIncrementDecrementExpressionItemProvider(this);
		}

		return preIncrementDecrementExpressionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.muml.uppaal.expressions.PostIncrementDecrementExpression} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PostIncrementDecrementExpressionItemProvider postIncrementDecrementExpressionItemProvider;

	/**
	 * This creates an adapter for a {@link org.muml.uppaal.expressions.PostIncrementDecrementExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPostIncrementDecrementExpressionAdapter() {
		if (postIncrementDecrementExpressionItemProvider == null) {
			postIncrementDecrementExpressionItemProvider = new PostIncrementDecrementExpressionItemProvider(this);
		}

		return postIncrementDecrementExpressionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.muml.uppaal.expressions.BitShiftExpression} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BitShiftExpressionItemProvider bitShiftExpressionItemProvider;

	/**
	 * This creates an adapter for a {@link org.muml.uppaal.expressions.BitShiftExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBitShiftExpressionAdapter() {
		if (bitShiftExpressionItemProvider == null) {
			bitShiftExpressionItemProvider = new BitShiftExpressionItemProvider(this);
		}

		return bitShiftExpressionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.muml.uppaal.expressions.MinMaxExpression} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MinMaxExpressionItemProvider minMaxExpressionItemProvider;

	/**
	 * This creates an adapter for a {@link org.muml.uppaal.expressions.MinMaxExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMinMaxExpressionAdapter() {
		if (minMaxExpressionItemProvider == null) {
			minMaxExpressionItemProvider = new MinMaxExpressionItemProvider(this);
		}

		return minMaxExpressionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.muml.uppaal.expressions.BitwiseExpression} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BitwiseExpressionItemProvider bitwiseExpressionItemProvider;

	/**
	 * This creates an adapter for a {@link org.muml.uppaal.expressions.BitwiseExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBitwiseExpressionAdapter() {
		if (bitwiseExpressionItemProvider == null) {
			bitwiseExpressionItemProvider = new BitwiseExpressionItemProvider(this);
		}

		return bitwiseExpressionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.muml.uppaal.expressions.ChannelPrefixExpression} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChannelPrefixExpressionItemProvider channelPrefixExpressionItemProvider;

	/**
	 * This creates an adapter for a {@link org.muml.uppaal.expressions.ChannelPrefixExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createChannelPrefixExpressionAdapter() {
		if (channelPrefixExpressionItemProvider == null) {
			channelPrefixExpressionItemProvider = new ChannelPrefixExpressionItemProvider(this);
		}

		return channelPrefixExpressionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.muml.uppaal.expressions.DataPrefixExpression} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataPrefixExpressionItemProvider dataPrefixExpressionItemProvider;

	/**
	 * This creates an adapter for a {@link org.muml.uppaal.expressions.DataPrefixExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDataPrefixExpressionAdapter() {
		if (dataPrefixExpressionItemProvider == null) {
			dataPrefixExpressionItemProvider = new DataPrefixExpressionItemProvider(this);
		}

		return dataPrefixExpressionItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (negationExpressionItemProvider != null) negationExpressionItemProvider.dispose();
		if (plusExpressionItemProvider != null) plusExpressionItemProvider.dispose();
		if (minusExpressionItemProvider != null) minusExpressionItemProvider.dispose();
		if (assignmentExpressionItemProvider != null) assignmentExpressionItemProvider.dispose();
		if (identifierExpressionItemProvider != null) identifierExpressionItemProvider.dispose();
		if (scopedIdentifierExpressionItemProvider != null) scopedIdentifierExpressionItemProvider.dispose();
		if (literalExpressionItemProvider != null) literalExpressionItemProvider.dispose();
		if (arithmeticExpressionItemProvider != null) arithmeticExpressionItemProvider.dispose();
		if (logicalExpressionItemProvider != null) logicalExpressionItemProvider.dispose();
		if (functionCallExpressionItemProvider != null) functionCallExpressionItemProvider.dispose();
		if (compareExpressionItemProvider != null) compareExpressionItemProvider.dispose();
		if (conditionExpressionItemProvider != null) conditionExpressionItemProvider.dispose();
		if (quantificationExpressionItemProvider != null) quantificationExpressionItemProvider.dispose();
		if (preIncrementDecrementExpressionItemProvider != null) preIncrementDecrementExpressionItemProvider.dispose();
		if (postIncrementDecrementExpressionItemProvider != null) postIncrementDecrementExpressionItemProvider.dispose();
		if (bitShiftExpressionItemProvider != null) bitShiftExpressionItemProvider.dispose();
		if (minMaxExpressionItemProvider != null) minMaxExpressionItemProvider.dispose();
		if (bitwiseExpressionItemProvider != null) bitwiseExpressionItemProvider.dispose();
		if (channelPrefixExpressionItemProvider != null) channelPrefixExpressionItemProvider.dispose();
		if (dataPrefixExpressionItemProvider != null) dataPrefixExpressionItemProvider.dispose();
	}

}
