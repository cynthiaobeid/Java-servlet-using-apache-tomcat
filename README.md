# Java-servlet-using-apache-tomcat

Our application consists of developing a servlet using apache tomcat version 10 which can be downloaded from this link: https://tomcat.apache.org/download-10.cgi.

Once we download the server apache tomcat, we can find a folder named "Apache Software Fondation" in the Program Files directory. We created a folder "servlet" in webapps that will 
contain our java servlet. The html file "index" represents the html page that will be deployed if we enter on a browser this url: http://localhost:8080/servlet/ . The page includes 
a text field where we can enter our name, and if we click submit, the servlet will be called. We can see that the url will change to: http://localhost:8080/servlet/TestServlet?tf1=cynthia.
The "TestServlet.java" file created in WEB-INF/src represents the java code of our servlet application, and the "TestServlet.class" file in WEB-INF/classes represents the java class that
will be created once we compile "TestServlet.java". The "web.xml" document in WEB-INF can get our servlet to be accessible from a browser, by mentioning in the servlet container what is the servlet to deploy,
and what URL's to map the servlet to. 

After creating all of these files, we should run the server by double clicking on Tomcat10 application in the "bin" directory, and now we can deploy the servlet on the browser.

You can check the print screens for more details.
