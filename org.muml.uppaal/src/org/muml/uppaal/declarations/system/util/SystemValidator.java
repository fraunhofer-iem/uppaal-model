/**
 */
package org.muml.uppaal.declarations.system.util;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.muml.uppaal.declarations.system.InstantiationList;
import org.muml.uppaal.declarations.system.ProgressMeasure;
import org.muml.uppaal.declarations.system.SystemPackage;
import org.muml.uppaal.declarations.system.TemplateDeclaration;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.muml.uppaal.declarations.system.SystemPackage
 * @generated
 */
public class SystemValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final SystemValidator INSTANCE = new SystemValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.muml.uppaal.declarations.system";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return SystemPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case SystemPackage.TEMPLATE_DECLARATION:
				return validateTemplateDeclaration((TemplateDeclaration)value, diagnostics, context);
			case SystemPackage.SYSTEM:
				return validateSystem((org.muml.uppaal.declarations.system.System)value, diagnostics, context);
			case SystemPackage.INSTANTIATION_LIST:
				return validateInstantiationList((InstantiationList)value, diagnostics, context);
			case SystemPackage.PROGRESS_MEASURE:
				return validateProgressMeasure((ProgressMeasure)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTemplateDeclaration(TemplateDeclaration templateDeclaration, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(templateDeclaration, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(templateDeclaration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(templateDeclaration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(templateDeclaration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(templateDeclaration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(templateDeclaration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(templateDeclaration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(templateDeclaration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(templateDeclaration, diagnostics, context);
		if (result || diagnostics != null) result &= validateTemplateDeclaration_NumberOfArgumentsMatchesDeclaration(templateDeclaration, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the NumberOfArgumentsMatchesDeclaration constraint of '<em>Template Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String TEMPLATE_DECLARATION__NUMBER_OF_ARGUMENTS_MATCHES_DECLARATION__EEXPRESSION = "(not self.declaredTemplate.oclIsUndefined() and not self.declaredTemplate.referredTemplate.oclIsUndefined())\r\n" +
		"implies\r\n" +
		"self.argument->size() = self.declaredTemplate.referredTemplate.parameter->size()";

	/**
	 * Validates the NumberOfArgumentsMatchesDeclaration constraint of '<em>Template Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTemplateDeclaration_NumberOfArgumentsMatchesDeclaration(TemplateDeclaration templateDeclaration, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SystemPackage.Literals.TEMPLATE_DECLARATION,
				 templateDeclaration,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "NumberOfArgumentsMatchesDeclaration",
				 TEMPLATE_DECLARATION__NUMBER_OF_ARGUMENTS_MATCHES_DECLARATION__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSystem(org.muml.uppaal.declarations.system.System system, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(system, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(system, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(system, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(system, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(system, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(system, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(system, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(system, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(system, diagnostics, context);
		if (result || diagnostics != null) result &= validateSystem_EachTemplateReferencedAtMostOnce(system, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the EachTemplateReferencedAtMostOnce constraint of '<em>System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SYSTEM__EACH_TEMPLATE_REFERENCED_AT_MOST_ONCE__EEXPRESSION = "self.instantiationList->collect(template)->isUnique(t : templates::AbstractTemplate | t)";

	/**
	 * Validates the EachTemplateReferencedAtMostOnce constraint of '<em>System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSystem_EachTemplateReferencedAtMostOnce(org.muml.uppaal.declarations.system.System system, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SystemPackage.Literals.SYSTEM,
				 system,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "EachTemplateReferencedAtMostOnce",
				 SYSTEM__EACH_TEMPLATE_REFERENCED_AT_MOST_ONCE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInstantiationList(InstantiationList instantiationList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(instantiationList, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgressMeasure(ProgressMeasure progressMeasure, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(progressMeasure, diagnostics, context);
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //SystemValidator
