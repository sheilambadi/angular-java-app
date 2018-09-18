package com.sheilambadi.schoolproject.api;

import java.io.File;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

/**
 *
 * @author sheilambadi
 */
@Path("/excel")
public class ExcelService {

    private static final String FILE_PATH_EXAMS = "/home/sheilambadi/Desktop/Samples/exam sample.xlsx";
    private static final String FILE_PATH_STUDENTS = "/home/sheilambadi/Desktop/Samples/student sample.xlsx";

    @GET
    @Path("/exams")
    @Produces("application/vnd.ms-excel")
    public Response getExamsFile() {

        File file = new File(FILE_PATH_EXAMS);

        ResponseBuilder response = Response.ok((Object) file);
        response.header("Content-Disposition",
                "attachment; filename=exam-excel-file.xls");
        return response.build();

    }
    
    @GET
    @Path("/students")
    @Produces("application/vnd.ms-excel")
    public Response getStudentsFile() {

        File file = new File(FILE_PATH_STUDENTS);

        ResponseBuilder response = Response.ok((Object) file);
        response.header("Content-Disposition",
                "attachment; filename=student-excel-file.xls");
        return response.build();

    }

}
