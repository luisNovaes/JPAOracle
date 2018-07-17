<%-- 
    Document   : campoData
    Created on : 26/06/2018, 15:00:40
    Author     : luis.silva
--%>

<%@attribute name="id" required="true" %>

<input	type="text" id="${id}" name="${id}"	/>
<script>
    $("#${id}").datepicker({dateFormat: 'dd/mm/yy'});
</script>

