<html lang="en">
<body>
<h1>Hello ${task.assignee.username}!</h1>
<p>Task <b>${task.name}</b> has been assigned to you. Start date: ${(task.startDate)!}</p>
<div>
    <#list task.timeEntries>
        Time entries time spent:
        <ul>
            <#items as timeEntry>
                <li>${timeEntry.timeSpent}</li>
            </#items>
        </ul>
    </#list>
    <img src="cid:attachment_id"/>
</div>
</body>
</html>