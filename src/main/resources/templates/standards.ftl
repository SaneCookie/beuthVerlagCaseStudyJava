<!DOCTYPE html>
<html>
<head>
    <title>Standards List</title>
    <style>
        .standard-item {
            margin-bottom: 20px;
            padding-bottom: 10px;
            border-bottom: 1px solid #000;
        }
        .standard-item:last-child {
            border-bottom: none;
        }
        .standard-header {
            font-weight: bold;
        }
        .standard-issue-date,
        .standard-working-group {
            margin: 5px 0;
        }
    </style>
</head>
<body>
    <#list standards as standard>
        <div class="standard-item">
            <div class="standard-header">${standard.dokNr} - ${standard.title}</div>
            <div class="standard-issue-date">Ausgabedatum: ${standard.issueDate?string("yyyy-MM")}</div>
            <#if standard.workingGrem??>
            <div class="standard-working-group">Erarbeitendes Gremium: ${standard.workingGrem}</div>
            <#else>
            <div class="standard-working-group">Erarbeitendes Gremium: Not Available</div>
            </#if>
        </div>
    </#list>
</body>
</html>
