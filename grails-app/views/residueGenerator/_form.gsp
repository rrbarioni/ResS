<%@ page import="residueGenerator.ResidueGenerator" %>



<div class="fieldcontain ${hasErrors(bean: residueGeneratorInstance, field: 'nameGenerator', 'error')} ">
	<label for="nameGenerator">
		<g:message code="residueGenerator.nameGenerator.label" default="Name Generator" />
		
	</label>
	<g:textField name="nameGenerator" value="${residueGeneratorInstance?.nameGenerator}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: residueGeneratorInstance, field: 'type', 'error')} ">
	<label for="type">
		<g:message code="residueGenerator.type.label" default="Type" />
		
	</label>
	<g:select name="type" from="${residueGeneratorInstance.constraints.type.inList}" value="${residueGeneratorInstance?.type}" valueMessagePrefix="residueGenerator.type" noSelection="['': '']"/>
</div>

<div class="fieldcontain ${hasErrors(bean: residueGeneratorInstance, field: 'addressGenerator', 'error')} required">
	<label for="addressGenerator">
		<g:message code="residueGenerator.addressGenerator.label" default="Address Generator" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="addressGenerator" maxlength="40" required="" value="${residueGeneratorInstance?.addressGenerator}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: residueGeneratorInstance, field: 'averageDailyMeals', 'error')} required">
	<label for="averageDailyMeals">
		<g:message code="residueGenerator.averageDailyMeals.label" default="Average Daily Meals" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="averageDailyMeals" type="number" min="0" value="${residueGeneratorInstance.averageDailyMeals}" required=""/>
</div>

<div class="fieldcontain ${hasErrors(bean: residueGeneratorInstance, field: 'averageMonthlyMeals', 'error')} required">
	<label for="averageMonthlyMeals">
		<g:message code="residueGenerator.averageMonthlyMeals.label" default="Average Monthly Meals" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="averageMonthlyMeals" type="number" min="0" value="${residueGeneratorInstance.averageMonthlyMeals}" required=""/>
</div>

<div class="fieldcontain ${hasErrors(bean: residueGeneratorInstance, field: 'cnpj', 'error')} ">
	<label for="cnpj">
		<g:message code="residueGenerator.cnpj.label" default="Cnpj" />
		
	</label>
	<g:textField name="cnpj" value="${residueGeneratorInstance?.cnpj}"/>
</div>

