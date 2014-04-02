/*
 *  
 * [y] hybris Platform
 *  
 * Copyright (c) 2000-2011 hybris AG
 * All rights reserved.
 *  
 * This software is the confidential and proprietary information of hybris
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with hybris.
 *  
 */
package de.hybris.tutorial.task1.jalo;

import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import de.hybris.tutorial.task1.constants.Hybristask1Constants;
import org.apache.log4j.Logger;

@SuppressWarnings("PMD")
public class Hybristask1Manager extends GeneratedHybristask1Manager
{
	@SuppressWarnings("unused")
	private static Logger log = Logger.getLogger( Hybristask1Manager.class.getName() );
	
	public static final Hybristask1Manager getInstance()
	{
		ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (Hybristask1Manager) em.getExtension(Hybristask1Constants.EXTENSIONNAME);
	}
	
}
