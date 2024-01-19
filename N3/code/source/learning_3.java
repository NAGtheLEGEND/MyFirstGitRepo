

// -----( IS Java Code Template v1.2

import com.wm.data.*;
import com.wm.util.Values;
import com.wm.app.b2b.server.Service;
import com.wm.app.b2b.server.ServiceException;
// --- <<IS-START-IMPORTS>> ---
// --- <<IS-END-IMPORTS>> ---

public final class learning_3

{
	// ---( internal utility methods )---

	final static learning_3 _instance = new learning_3();

	static learning_3 _newInstance() { return new learning_3(); }

	static learning_3 _cast(Object o) { return (learning_3)o; }

	// ---( server methods )---




	public static final void studentMarksJava (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(studentMarksJava)>> ---
		// @sigtype java 3.5
		// [i] field:0:required Name
		// [i] field:0:required RollNo
		// [i] field:0:required Marathi
		// [i] field:0:required English
		// [i] field:0:required Maths
		// [i] field:0:required Hindi
		// [i] field:0:required Science
		// [o] field:0:required TotalMarks
		// [o] field:0:required Percentage
		// [o] field:0:required Grade
		// pipeline
		IDataCursor pipelineCursor = pipeline.getCursor();
			String	Name = IDataUtil.getString( pipelineCursor, "Name" );
			String	RollNo = IDataUtil.getString( pipelineCursor, "RollNo" );
			String	Marathi = IDataUtil.getString( pipelineCursor, "Marathi" );
			String	English = IDataUtil.getString( pipelineCursor, "English" );
			String	Maths = IDataUtil.getString( pipelineCursor, "Maths" );
			String	Hindi = IDataUtil.getString( pipelineCursor, "Hindi" );
			String	Science = IDataUtil.getString( pipelineCursor, "Science" );
			String grd ="";
			Integer ma= Integer.parseInt(Marathi);
			Integer en= Integer.parseInt(English);
			Integer math= Integer.parseInt(Maths);
			Integer sc= Integer.parseInt(Science);
			Integer hn= Integer.parseInt(Hindi);
			
			Integer total = ma+en+math+sc+hn;
			Integer perc = total/5;
			
			if(perc >= 70)
			{
				grd= "Distinction";
			}
			else if (perc > 60 && perc <= 70)
			{
				grd= "First Class";
			}
			else if (perc > 40 && perc <= 60)
			{
				grd= "Second Class";
			}
			else if (perc > 35 && perc <= 40)
			{
				grd= "Third Class";
			}
			else
			{
				grd= "Failed";
			}
		pipelineCursor.destroy();
		
		// pipeline
		IDataCursor pipelineCursor_1 = pipeline.getCursor();
		IDataUtil.put( pipelineCursor_1, "Name", Name );
		IDataUtil.put( pipelineCursor_1, "RollNo", RollNo );
		IDataUtil.put( pipelineCursor_1, "TotalMarks", total.toString() );
		IDataUtil.put( pipelineCursor_1, "Percentage", perc.toString() );
		IDataUtil.put( pipelineCursor_1, "Grade", grd );
		
		
		pipelineCursor_1.destroy();
		
			
		// --- <<IS-END>> ---

                
	}
}

