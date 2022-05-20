
function getData()
{
	let fname = document.getElementById("fname").value;
	let lname = document.getElementById("lname").value;
	let dob = document.getElementById("dob").value;
	let mob = document.getElementById("mob").value;
	let sal = document.getElementById("sal").value;
	let entryTime = document.getElementById("entryTime").value;
	let gender = getGender();
	let skills = getSkills();
	let pswd = document.getElementById("pswd").value;
	let cfpswd = document.getElementById("cfpswd").value;
	let userType = document.getElementById("userType").value;

	checkPassword(pswd, cfpswd);

	console.log(fname, lname, dob, mob, sal, entryTime, gender, skills, pswd, cfpswd, userType);
	return fname + " " + lname + " " + dob + " " + mob + " " + sal + " " + entryTime + " " + gender + " " + skills + " " + pswd + " " + cfpswd + " " + userType;
}

function getGender()
{
	let genders = document.getElementsByName("gender");
	let result = "";

	for(let gender of genders)
	{
		if(gender.checked)
		{
			result = document.getElementById(gender.id).value;
			break;
		}
	}
	return result;
}

function getSkills()
{
	let skills = document.getElementsByName("skills");
	let result = "";

	for(let skill of skills)
	{
		if(skill.checked)
		{
			result += document.getElementById(skill.id).value + " ";
		}
	}
	return result;
}

function displayEnteredData()
{

	document.getElementById("enteredData").innerHTML = "<h2>" + getData() + "</h2>";

}

function checkPassword(pswd, cfpswd)
{

	if(pswd != null && pswd != "" && cfpswd != null && cfpswd != "" && pswd == cfpswd)
		console.log("Entered passwords are same...");
	else
		console.log("Entered passwords are not same...");
}