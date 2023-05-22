package com.chess.engine.pieces;

import com.chess.engine.Alliance.Alliance;
import com.chess.engine.board.Board;
import com.chess.engine.board.Move;

import java.util.List;

public abstract class Piece {

    protected final int piecePosition;

    protected final Alliance pieceAlliance;     // voire  si je doit importer la class alliance oou si ces auto//

    Piece(final int piecePosition, final Alliance pieceAlliance) {

        this.pieceAlliance = pieceAlliance;
        this.piecePosition = piecePosition;
    }
public  Alliance getPieceAlliance(){
    return this.pieceAlliance;
    }

    public List<Move> calculateLegaleMoves(final Board board) {

    }



