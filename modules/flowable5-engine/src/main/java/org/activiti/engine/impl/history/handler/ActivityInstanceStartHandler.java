/* Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.activiti.engine.impl.history.handler;

import org.activiti.engine.impl.context.Context;
import org.activiti.engine.impl.persistence.entity.ExecutionEntity;
import org.flowable.engine.delegate.DelegateExecution;
import org.flowable.engine.delegate.ExecutionListener;

/**
 * @author Tom Baeyens
 * 
 *         BE AWARE: For Start Events this is done in the ProcessDefinitionEntity!
 */
public class ActivityInstanceStartHandler implements ExecutionListener {

    @Override
    public void notify(DelegateExecution execution) {
        Context.getCommandContext().getHistoryManager()
                .recordActivityStart((ExecutionEntity) execution);
    }
}
