<!DOCTYPE html>
<html lang="vi">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Thank you - Murach Survey</title>
    <link rel="stylesheet" href="styles/main.css">
</head>
<body class="thank-page">
    <h1>Thanks for taking part in our survey</h1>
    <p>Here is the information that you entered:</p>

    <p><strong>Email:</strong> ${user.email}</p>
    <p><strong>First Name:</strong> ${user.firstName}</p>
    <p><strong>Last Name:</strong> ${user.lastName}</p>
    <p><strong>Date of Birth:</strong> ${empty user.dateOfBirth ? 'Not provided' : user.dateOfBirth}</p>
    <p><strong>Heard about us from:</strong> ${survey.howToHeardAbout}</p>
    <p><strong>Contact me by:</strong> ${survey.contactMethod}</p>
    <p><strong>Announcement preferences:</strong> ${survey.announcements}</p>

    <p><a href="${pageContext.request.contextPath}/index.html">Return to survey</a></p>
</body>
</html>
