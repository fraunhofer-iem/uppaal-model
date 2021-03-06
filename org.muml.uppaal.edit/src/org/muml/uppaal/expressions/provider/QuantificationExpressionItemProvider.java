/**
 */
package org.muml.uppaal.expressions.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.muml.uppaal.declarations.DeclarationsFactory;
import org.muml.uppaal.declarations.DeclarationsPackage;
import org.muml.uppaal.expressions.ExpressionsFactory;
import org.muml.uppaal.expressions.ExpressionsPackage;
import org.muml.uppaal.expressions.QuantificationExpression;
import org.muml.uppaal.expressions.Quantifier;
import org.muml.uppaal.types.TypesFactory;

/**
 * This is the item provider adapter for a {@link org.muml.uppaal.expressions.QuantificationExpression} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class QuantificationExpressionItemProvider
	extends ExpressionItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuantificationExpressionItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addQuantifierPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Quantifier feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addQuantifierPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_QuantificationExpression_quantifier_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_QuantificationExpression_quantifier_feature", "_UI_QuantificationExpression_type"),
				 ExpressionsPackage.Literals.QUANTIFICATION_EXPRESSION__QUANTIFIER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(DeclarationsPackage.Literals.TYPED_ELEMENT_CONTAINER__TYPE_DEFINITION);
			childrenFeatures.add(DeclarationsPackage.Literals.TYPED_ELEMENT_CONTAINER__ELEMENTS);
			childrenFeatures.add(ExpressionsPackage.Literals.QUANTIFICATION_EXPRESSION__EXPRESSION);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns QuantificationExpression.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/QuantificationExpression"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		Quantifier labelValue = ((QuantificationExpression)object).getQuantifier();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ?
			getString("_UI_QuantificationExpression_type") :
			getString("_UI_QuantificationExpression_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(QuantificationExpression.class)) {
			case ExpressionsPackage.QUANTIFICATION_EXPRESSION__QUANTIFIER:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case ExpressionsPackage.QUANTIFICATION_EXPRESSION__TYPE_DEFINITION:
			case ExpressionsPackage.QUANTIFICATION_EXPRESSION__ELEMENTS:
			case ExpressionsPackage.QUANTIFICATION_EXPRESSION__EXPRESSION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(DeclarationsPackage.Literals.TYPED_ELEMENT_CONTAINER__TYPE_DEFINITION,
				 ExpressionsFactory.eINSTANCE.createNegationExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DeclarationsPackage.Literals.TYPED_ELEMENT_CONTAINER__TYPE_DEFINITION,
				 ExpressionsFactory.eINSTANCE.createPlusExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DeclarationsPackage.Literals.TYPED_ELEMENT_CONTAINER__TYPE_DEFINITION,
				 ExpressionsFactory.eINSTANCE.createMinusExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DeclarationsPackage.Literals.TYPED_ELEMENT_CONTAINER__TYPE_DEFINITION,
				 ExpressionsFactory.eINSTANCE.createAssignmentExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DeclarationsPackage.Literals.TYPED_ELEMENT_CONTAINER__TYPE_DEFINITION,
				 ExpressionsFactory.eINSTANCE.createIdentifierExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DeclarationsPackage.Literals.TYPED_ELEMENT_CONTAINER__TYPE_DEFINITION,
				 ExpressionsFactory.eINSTANCE.createScopedIdentifierExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DeclarationsPackage.Literals.TYPED_ELEMENT_CONTAINER__TYPE_DEFINITION,
				 ExpressionsFactory.eINSTANCE.createLiteralExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DeclarationsPackage.Literals.TYPED_ELEMENT_CONTAINER__TYPE_DEFINITION,
				 ExpressionsFactory.eINSTANCE.createArithmeticExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DeclarationsPackage.Literals.TYPED_ELEMENT_CONTAINER__TYPE_DEFINITION,
				 ExpressionsFactory.eINSTANCE.createLogicalExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DeclarationsPackage.Literals.TYPED_ELEMENT_CONTAINER__TYPE_DEFINITION,
				 ExpressionsFactory.eINSTANCE.createFunctionCallExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DeclarationsPackage.Literals.TYPED_ELEMENT_CONTAINER__TYPE_DEFINITION,
				 ExpressionsFactory.eINSTANCE.createCompareExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DeclarationsPackage.Literals.TYPED_ELEMENT_CONTAINER__TYPE_DEFINITION,
				 ExpressionsFactory.eINSTANCE.createConditionExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DeclarationsPackage.Literals.TYPED_ELEMENT_CONTAINER__TYPE_DEFINITION,
				 ExpressionsFactory.eINSTANCE.createQuantificationExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DeclarationsPackage.Literals.TYPED_ELEMENT_CONTAINER__TYPE_DEFINITION,
				 ExpressionsFactory.eINSTANCE.createPreIncrementDecrementExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DeclarationsPackage.Literals.TYPED_ELEMENT_CONTAINER__TYPE_DEFINITION,
				 ExpressionsFactory.eINSTANCE.createPostIncrementDecrementExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DeclarationsPackage.Literals.TYPED_ELEMENT_CONTAINER__TYPE_DEFINITION,
				 ExpressionsFactory.eINSTANCE.createBitShiftExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DeclarationsPackage.Literals.TYPED_ELEMENT_CONTAINER__TYPE_DEFINITION,
				 ExpressionsFactory.eINSTANCE.createMinMaxExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DeclarationsPackage.Literals.TYPED_ELEMENT_CONTAINER__TYPE_DEFINITION,
				 ExpressionsFactory.eINSTANCE.createBitwiseExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DeclarationsPackage.Literals.TYPED_ELEMENT_CONTAINER__TYPE_DEFINITION,
				 ExpressionsFactory.eINSTANCE.createChannelPrefixExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DeclarationsPackage.Literals.TYPED_ELEMENT_CONTAINER__TYPE_DEFINITION,
				 ExpressionsFactory.eINSTANCE.createDataPrefixExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DeclarationsPackage.Literals.TYPED_ELEMENT_CONTAINER__TYPE_DEFINITION,
				 TypesFactory.eINSTANCE.createScalarTypeSpecification()));

		newChildDescriptors.add
			(createChildParameter
				(DeclarationsPackage.Literals.TYPED_ELEMENT_CONTAINER__TYPE_DEFINITION,
				 TypesFactory.eINSTANCE.createStructTypeSpecification()));

		newChildDescriptors.add
			(createChildParameter
				(DeclarationsPackage.Literals.TYPED_ELEMENT_CONTAINER__TYPE_DEFINITION,
				 TypesFactory.eINSTANCE.createRangeTypeSpecification()));

		newChildDescriptors.add
			(createChildParameter
				(DeclarationsPackage.Literals.TYPED_ELEMENT_CONTAINER__ELEMENTS,
				 DeclarationsFactory.eINSTANCE.createFunction()));

		newChildDescriptors.add
			(createChildParameter
				(DeclarationsPackage.Literals.TYPED_ELEMENT_CONTAINER__ELEMENTS,
				 DeclarationsFactory.eINSTANCE.createVariable()));

		newChildDescriptors.add
			(createChildParameter
				(DeclarationsPackage.Literals.TYPED_ELEMENT_CONTAINER__ELEMENTS,
				 DeclarationsFactory.eINSTANCE.createParameter()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.QUANTIFICATION_EXPRESSION__EXPRESSION,
				 ExpressionsFactory.eINSTANCE.createNegationExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.QUANTIFICATION_EXPRESSION__EXPRESSION,
				 ExpressionsFactory.eINSTANCE.createPlusExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.QUANTIFICATION_EXPRESSION__EXPRESSION,
				 ExpressionsFactory.eINSTANCE.createMinusExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.QUANTIFICATION_EXPRESSION__EXPRESSION,
				 ExpressionsFactory.eINSTANCE.createAssignmentExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.QUANTIFICATION_EXPRESSION__EXPRESSION,
				 ExpressionsFactory.eINSTANCE.createIdentifierExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.QUANTIFICATION_EXPRESSION__EXPRESSION,
				 ExpressionsFactory.eINSTANCE.createScopedIdentifierExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.QUANTIFICATION_EXPRESSION__EXPRESSION,
				 ExpressionsFactory.eINSTANCE.createLiteralExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.QUANTIFICATION_EXPRESSION__EXPRESSION,
				 ExpressionsFactory.eINSTANCE.createArithmeticExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.QUANTIFICATION_EXPRESSION__EXPRESSION,
				 ExpressionsFactory.eINSTANCE.createLogicalExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.QUANTIFICATION_EXPRESSION__EXPRESSION,
				 ExpressionsFactory.eINSTANCE.createFunctionCallExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.QUANTIFICATION_EXPRESSION__EXPRESSION,
				 ExpressionsFactory.eINSTANCE.createCompareExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.QUANTIFICATION_EXPRESSION__EXPRESSION,
				 ExpressionsFactory.eINSTANCE.createConditionExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.QUANTIFICATION_EXPRESSION__EXPRESSION,
				 ExpressionsFactory.eINSTANCE.createQuantificationExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.QUANTIFICATION_EXPRESSION__EXPRESSION,
				 ExpressionsFactory.eINSTANCE.createPreIncrementDecrementExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.QUANTIFICATION_EXPRESSION__EXPRESSION,
				 ExpressionsFactory.eINSTANCE.createPostIncrementDecrementExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.QUANTIFICATION_EXPRESSION__EXPRESSION,
				 ExpressionsFactory.eINSTANCE.createBitShiftExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.QUANTIFICATION_EXPRESSION__EXPRESSION,
				 ExpressionsFactory.eINSTANCE.createMinMaxExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.QUANTIFICATION_EXPRESSION__EXPRESSION,
				 ExpressionsFactory.eINSTANCE.createBitwiseExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.QUANTIFICATION_EXPRESSION__EXPRESSION,
				 ExpressionsFactory.eINSTANCE.createChannelPrefixExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.QUANTIFICATION_EXPRESSION__EXPRESSION,
				 ExpressionsFactory.eINSTANCE.createDataPrefixExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.QUANTIFICATION_EXPRESSION__EXPRESSION,
				 TypesFactory.eINSTANCE.createScalarTypeSpecification()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.QUANTIFICATION_EXPRESSION__EXPRESSION,
				 TypesFactory.eINSTANCE.createStructTypeSpecification()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.QUANTIFICATION_EXPRESSION__EXPRESSION,
				 TypesFactory.eINSTANCE.createRangeTypeSpecification()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == DeclarationsPackage.Literals.TYPED_ELEMENT_CONTAINER__TYPE_DEFINITION ||
			childFeature == ExpressionsPackage.Literals.QUANTIFICATION_EXPRESSION__EXPRESSION;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
