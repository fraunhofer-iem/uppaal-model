package de.uni_paderborn.uppaal.cmd.options.tuning;

import de.uni_paderborn.fujaba.common.cmd.Option;
import de.uni_paderborn.uppaal.cmd.VerifyTACommand;

public class ReuseStateSpaceOption extends Option<VerifyTACommand> {

	@Override
	public String getOption() {
		return "T";
	}

}