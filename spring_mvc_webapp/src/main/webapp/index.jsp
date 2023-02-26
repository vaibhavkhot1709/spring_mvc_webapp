<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Details</title>
</head>
<body>
	<h3>Fill Student Details</h3>

	<form action="createStudent" method="post">
		<table>

			<tr>
				<td>Roll:</td>
				<td><input type="text" name="roll" /></td>
			</tr>
			<tr>
				<td>Name:</td>
				<td><input type="text" name="name" /></td>
			</tr>
			<tr>
				<td>City:</td>
				<td><input type="text" name="city" /></td>
			</tr>


		</table>

		<input type="submit" value="Create Student">

	</form>

</body>
</html>
