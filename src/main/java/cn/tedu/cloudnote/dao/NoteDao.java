package cn.tedu.cloudnote.dao;

import java.util.List;
import java.util.Map;

import cn.tedu.cloudnote.entity.Note;

public interface NoteDao {
	public List<Map<String,Object>> 
				findByBookId(String bookId);
	public Note findByNoteId(String noteId);
	public int update(Note note);
	
	public int updateStatus(String noteId);
	//批量删除方法
	public int deleteNoteById(String id);
	//动态SQL批量删除
	public int deleteNotes(String... ary);
	
	public List<Note> findNotes(Map params);
}








