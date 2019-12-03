package cn.ztzh.cloud.test.testCloudDemo.util;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.event.ContextClosedEvent;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.LiveBeansView;

public class TestMytApplicationContext{ //extends AbstractApplicationContext


	//protected void refreshBeanFactory() throws BeansException, IllegalStateException {
		// TODO Auto-generated method stub
		
	//}

	//protected void closeBeanFactory() {
		// TODO Auto-generated method stub
		
	//}

	
	/*
	 * protected void doClose() { // Check whether an actual close attempt is
	 * necessary... if (this.active.get() && this.closed.compareAndSet(false, true))
	 * { if (logger.isDebugEnabled()) { logger.debug("Closing " + this); }
	 * 
	 * LiveBeansView.unregisterApplicationContext(this);
	 * 
	 * try { // Publish shutdown event. publishEvent(new ContextClosedEvent(this));
	 * } catch (Throwable ex) { logger.
	 * warn("Exception thrown from ApplicationListener handling ContextClosedEvent",
	 * ex); }
	 * 
	 * // Stop all Lifecycle beans, to avoid delays during individual destruction.
	 * if (this.lifecycleProcessor != null) { try {
	 * this.lifecycleProcessor.onClose(); } catch (Throwable ex) {
	 * logger.warn("Exception thrown from LifecycleProcessor on context close", ex);
	 * } }
	 * 
	 * // Destroy all cached singletons in the context's BeanFactory.
	 * destroyBeans();
	 * 
	 * // Close the state of this context itself. closeBeanFactory();
	 * 
	 * // Let subclasses do some final clean-up if they wish... onClose();
	 * 
	 * // Reset local application listeners to pre-refresh state. if
	 * (this.earlyApplicationListeners != null) { this.applicationListeners.clear();
	 * this.applicationListeners.addAll(this.earlyApplicationListeners); }
	 * 
	 * // Switch to inactive. this.active.set(false); } }
	 */
	//public ConfigurableListableBeanFactory getBeanFactory() throws IllegalStateException {
		// TODO Auto-generated method stub
		//return null;
	//}

}
