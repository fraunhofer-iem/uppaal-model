/*
 * generated by Xtext
 */
package org.muml.uppaal.trace.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class DiagnosticTraceAntlrTokenFileProvider implements IAntlrTokenFileProvider {
	
	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
    	return classLoader.getResourceAsStream("org/muml/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.tokens");
	}
}
