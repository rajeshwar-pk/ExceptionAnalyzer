# ExceptionAnalyzer
It is a BI application which reads any application log file or error log file and parses the data into useful chunks to get a first hand knowledge on 

         a) What type of errors occuring?
         b) Which one are the most common errors?
         c) In case of a specific error what are the most common terms associated with that error?
Architecture: This is a spring boot application connecting to any spark deployment.
The API allow to configure the spark URL to use. If spark URL is not provided then it will start creating a local spark instance created on the host where this codebase is deployed.

This application publishes rest api
1. http://{domainname}/analyzer/loadFile
2. http://{domainname}/analyzer/exceptions
3. http://{domainname}/analyzer/exceptions/words
